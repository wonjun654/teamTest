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
		System.out.println("사용자의 정보를 입력받는 프로그램입니다\n");
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
		System.out.print("이름 입력 : ");
		setName(sc.nextLine());
		System.out.print("성별 입력 : ");
		setGender(sc.next().charAt(0));
		System.out.print("나이 입력 : ");
		setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("전화번호 입력 : ");
		setPhone(sc.nextLine());
		System.out.print("주소입력 : ");
		setAddress(sc.nextLine());
		System.out.print("취미입력 : ");
		setHobby(sc.nextLine());
	}

	public void output() {
		System.out.println("\n\n----------입력하신 사용자 정보----------");
		System.out.println("이름 : " + getName());
		System.out.println("성별 : " + getGender());
		System.out.println("나이 : " + getAge());
		System.out.println("전화번호 : " + getPhone());
		System.out.println("주소 : " + getAddress());
		System.out.println("취미 : " + getHobby());
	}

}
