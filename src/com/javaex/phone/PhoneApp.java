package com.javaex.phone;

import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneDao phoneDao = new PhoneDao();

		System.out.println("************************************");
		System.out.println("*            전화번호 관리 프로그램           *");
		System.out.println("************************************");

		while (true) {
			System.out.println();
			System.out.println("1.리스트\t2.등록\t3.수정\t4.삭제\t5.검색\t6.종료");
			System.out.println("--------------------------------------");
			System.out.print(">메뉴번호: ");
			String s = sc.nextLine();
			
			if (s.equals("6")) {
				System.out.println("************************************");
				System.out.println("*             감사합니다.             *");
				System.out.println("************************************");
				break;
			} else {
				if(s.equals("1")) {
					List<PersonVo> personList = phoneDao.getPhoneList();
					System.out.println("1. 리스트");
					for(PersonVo persons:personList) {
						System.out.println(persons.getPerson_id()+"\t"+persons.getName()+"\t"+
					                       persons.getHp()+"\t"+persons.getCompany());
					}
				}else if(s.equals("2")) {
					System.out.println("<2.등록> ");
					System.out.print("이름 > ");
					String name = sc.nextLine();
					System.out.print("휴대전화 > ");
					String hp = sc.nextLine();
					System.out.print("회사번호 > ");
					String company = sc.nextLine();
					PersonVo personVo = new PersonVo(name,hp,company);
					phoneDao.PhoneInsert(personVo);
					
				}else if(s.equals("3")) {
					System.out.println("<3.수정>");
					System.out.print("번호 > ");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.print("이름 > ");
					String name = sc.nextLine();
					System.out.print("휴대전화 > ");
					String hp = sc.nextLine();
					System.out.print("회사번호 > ");
					String company = sc.nextLine();
					PersonVo personVo = new PersonVo(num, name, hp, company);
					phoneDao.PhoneUpdate(personVo);
					
				}else if(s.equals("4")) {
					System.out.println("<4.삭제>");
					System.out.print(">번호: ");
					int deleteNum = sc.nextInt();
					sc.nextLine();
					phoneDao.PhoneDelete(deleteNum);
				}else if(s.equals("5")) {
					System.out.println("<5.검색>");
					System.out.print("검색어: ");
					String toFindS = sc.nextLine();
					List<PersonVo> personList = phoneDao.getPhoneList();
					for(PersonVo persons:personList) {
						if(persons.getName().contains(toFindS)||persons.getHp().contains(toFindS)
								||persons.getCompany().contains(toFindS)) {
							System.out.println(persons.getPerson_id()+"\t"+persons.getName()+"\t"+
											   persons.getHp()+"\t"+persons.getCompany());
						}
					}
				}else {
					System.out.println("다시 입력해주세요.");
				}
			}
		}
		
		sc.close();
	}
}
