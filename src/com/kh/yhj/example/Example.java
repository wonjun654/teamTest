package com.kh.yhj.example;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String address;
	private String hobby;

	public Example() {
		System.out.println("������� ������ �Է¹޴� ���α׷��Դϴ�\n");
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private char getGender() {
		return gender;
	}

	private void setGender(char gender) {
		this.gender = gender;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	private String getPhone() {
		return phone;
	}

	private void setPhone(String phone) {
		this.phone = phone;
	}

	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private String getHobby() {
		return hobby;
	}

	private void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void input() {
		System.out.print("�̸� �Է� : ");
		setName(sc.nextLine());
		System.out.print("���� �Է� : ");
		setGender(sc.next().charAt(0));
		System.out.print("���� �Է� : ");
		setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("��ȭ��ȣ �Է� : ");
		setPhone(sc.nextLine());
		System.out.print("�ּ��Է� : ");
		setAddress(sc.nextLine());
		System.out.print("����Է� : ");
		setHobby(sc.nextLine());
	}

	public void output() {
		System.out.println("\n\n----------�Է��Ͻ� ����� ����----------");
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getGender());
		System.out.println("���� : " + getAge());
		System.out.println("��ȭ��ȣ : " + getPhone());
		System.out.println("�ּ� : " + getAddress());
		System.out.println("��� : " + getHobby());
	}

}
