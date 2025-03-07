package exceptionHandling;

import java.util.InputMismatchException;

public class VotingSystem {
	public static void main(String[] args) {
		try {
			int age=1;
			Person p=new Person();
			p.checkVotingEligibility(age);
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i.getMessage());
		}
	}
}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class Person{
	public void checkVotingEligibility(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Error:age must be greater than 18");
		}
		else
		{
			System.out.println("you are eligible to vote");
		}
	}
}

