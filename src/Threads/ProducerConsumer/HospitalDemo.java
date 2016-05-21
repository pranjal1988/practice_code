package Threads.ProducerConsumer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.SynchronousQueue;

public class HospitalDemo extends Object {

	//private List synchedPatientsList;
	private Object objectLock ;
	private ConcurrentLinkedQueue<String> queue;
	
	public HospitalDemo() {
		// create a new synchronized list to be used
		//synchedPatientsList = Collections.synchronizedList(new LinedList());
		queue = new ConcurrentLinkedQueue<String>();
		objectLock = new Object();
	}

	// method used to remove an element from the list
	public String callPatientForConsult() throws InterruptedException {
		synchronized (objectLock) {
			// while the list is empty, wait
			while (queue.isEmpty()) {
				System.out.println("No patients to consult for doctor " + Thread.currentThread().getName() + " at time " + System.currentTimeMillis());
				System.out.println("Doctor " + Thread.currentThread().getName()  +" Waiting...");
				objectLock.wait();
				System.out.println("Wait over for "+ Thread.currentThread().getName() + " at time " + System.currentTimeMillis() );
			}
			String element = (String) queue.poll();
			return element;
		}
	}

	// method to add an element in the list
	public void admitPatientForConsult(String element) throws InterruptedException {
		Random rd = new Random();
		synchronized (objectLock) {
			// add an element and notify all that an element exists
			queue.offer(element);
			System.out.println("R1) New Patient:'" + element + "'");
			int w8Multiplier = 1; //rd.nextInt(5);
			Thread.sleep(5000);
			System.out.println("R2) admited patient " + element + " in " + 5000*w8Multiplier + " miliSec at time " + System.currentTimeMillis());
			System.out.println("R3) notifying doctors! at time " + System.currentTimeMillis());
			objectLock.notifyAll();
		}
		System.out.println("R4) Patient send to waiting room... at time " + System.currentTimeMillis());
	}

	public static void main(String[] args) {
		final HospitalDemo demo = new HospitalDemo();

		Runnable consultingPatient = new Runnable() {

			public void run() {
				try {
					while(true){
						String item = demo.callPatientForConsult();
						System.out.println("Consulting started for patient : " + item + " by doctor " + Thread.currentThread().getName() + " at time " + System.currentTimeMillis());
						Random rd = new Random();
						int w8Multiplier = 0; //rd.nextInt(7);
						//Thread.sleep(200);
						System.out.println("Consulting finished for patient : " + item + " by doctor " + Thread.currentThread().getName() + " in " + 200*w8Multiplier + " miliSec at time " + System.currentTimeMillis());
					}
				} catch (InterruptedException ix) {
					System.out.println("Doctor Consultation Interrupted Exception for Doctor " + Thread.currentThread().getName() + "!");
				} catch (Exception x) {
					System.out.println("Exception thrown from consultingPatient for " + Thread.currentThread().getName() );
					System.out.println("exception :- " + x.toString());
				}
			}
		};

		Runnable registeringPatient = new Runnable() {
			// run adds an element in the list and starts the loop
			public void run() {
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String patientName = br.readLine();
					while(patientName != null || !patientName.equals("0")){
						demo.admitPatientForConsult(patientName);
						patientName = br.readLine();
					}
				} catch (InterruptedException e) {
					System.out.println("Registering Patient Interrupted Exception!");
				} catch (Exception x) {
					System.out.println("Exception thrown for " + Thread.currentThread().getName() );
					System.out.println("exception :-" + x.toString());
				}

			}
		};

		try {
			Thread doctor1 = new Thread(consultingPatient, "Doctor-1");
			doctor1.start();

			//Thread.sleep(500);

			Thread doctor2 = new Thread(consultingPatient, "Doctor-2");
			doctor2.start();

			//Thread.sleep(500);

			Thread reception = new Thread(registeringPatient, "Reception");
			reception.start();

			//Thread.sleep(1000);

			/*doctor1.interrupt();
			doctor2.interrupt();*/
			doctor1.join();
			doctor2.join();
			reception.join();
		} catch (InterruptedException x) {
		}
	}
}
