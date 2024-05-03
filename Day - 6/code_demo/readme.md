Day 6
=======
MultiThreading 
==============
	Process - Running instances of a program/application
			- Each Process has its own memory space
			- Heavyweight
	
	Thread - Execution path/ Each task in a process handled by a thread
	
			- Multiple threads can run concurrently in a process 
			
			- Thread shares the memory space of a process
			
			- Lightweight
			
			For example:
				In MS Word application, typing task is handled by one thread and 
					Spelling check - handled by another thread
					
					
	Create Threads
	=================
		2 ways to create thread
		=========================
			- Extend Thread class
				Thread class - java.lang 
							 - implements Runnable interface
							 
						Constructor of Thread class
						============================
							Thread()
							
							Thread(String threadName)
							
							Thread (Runnable runnable)
							
							Thread (Runnable runnable, String threadName)
			
			- Implements Runnable interface
						- run() method
						
						
		Thread methods
		--------------
			- setName(String threadName) - Set thread name
			
			- getName() - Returns thread name
			
			- setPriority(int proiority) - Set the thread priority
			
			- getPriority() - Returns the priority of a thread
			
			- sleep(long milliseconds) - static method - Makes a thread to sleep for specified milliseconds
										- Throws checked exception - InterruptedException
			
			- currentThread() - static method - Returns the reference of instance of current executing thread 
			
			- join() - Make a thread to join the execution with another thread
			
					- Overloaded method - join(long milliseconds)
					
					- Throws checked exception - InterruptedException
					
			- interrupt() - Interrupt the execution of thread
			
			- isAlive() - To check whether the current thread is alive or not
			
			- wait() - To make a thread to wait for its execution.
			
					- Overloaded method - wait(long milliseconds)
				
			- notify() - To notify a thread
			
			- notifyAll() - To notify all threads 
	
	Thread Priority
	===================
		Thread Scheduler executes thread based on their priority
		
		Higher priority thread is executed first than the lower priority thread.
		
		Normal priority - 5 - NORM_PRIORITY - public static final int NORM_PRIORITY =5
		
		Minimum Priority - 1 - MIN_PRIORITY
		
		Maximum Priority - 10 - MAX_PRIORITY
		
		
	Thread Life cycle
	==================
		Thread enters into the following states from creation till execution completes
		
			New state - When a new instance of Thread is created using new keyword
			
					Thread thread1=new Thread(); //New State
					
			Runnable state - When start() method is called 
							thread1.start() //Runnable state
						
							
			Running state - When run() method is in execution 
							
			
			Not Runnable state 
							- When thread sleeps - Call to  sleep(long milisec) method 
									- Resumes execution when the sleep period is expired 
							- Thread waiting for resource or wait() method called 
								Thread can resumes its execution if wait period is expired or goes to dead state when resource is not received.
							
							- Lower priority thread blocked by higher priority thread
								Lower priority thread resumes its execution once higher priority thread is completed
								
							
				Dead state
						- When thread completes its execution
						
						- When thread execution is interrupted 
						
						- When thread is waited for the resource
						
		public static final Thread.State NEW
		
		public static final Thread.State BLOCKED
		
		public static final Thread.State WAITING
			- Object.wait with no timeout
			- Thread.join with no timeout
		
		public static final Thread.State RUNNABLE

		public static final Thread.State TIMED_WAITING
			Thread.sleep
			Object.wait with timeout
			Thread.join with timeout
			
		public static final Thread.State TERMINATED
			
		
	Thread Synchronization
	========================
		Issues in multi-threaded application
		=======================================
		 - Lock Starvation
		 
		 - Race Condition
		 
		 - Deadlock
			This can be prevented by running threads in synchronization.
				Thread Synchronization can be implemented using:
					synchronized method
					synchronized block
				
					A method or block can be declared synchronized - synchronized keyword
					
					synchronized block or method - Only one thread at a time can apply lock to it in multi-threaded environment
	
	
	InterThread Communication
	--------------------------
		Producer Thread - Produces data
		
		Consumer Thread - Consumes the data
		
		The speed rate of producing data by Producer Thread is faster as compared to consuming the data by Consumer Thread
		
		wait()- It will make a thread to wait till it is being notified
		
		
		notify() - It will notify the threads in execution
		
		This is mostly used in Pub/Sub model
		
		
		
		

	
	