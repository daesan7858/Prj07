package ex03e1;

import java.util.Scanner;

//입력 1줄 -> 결과 1줄
//입력data : 사번,이름,입사일,월급,부서번호
//출력     : 사번,이름,입사일,월급,보너스,수령액,부서명

//금액은 소수이하 두자리로 반올림
//보너스   =  근무연수에 따라 월급의 0.5% 로 계산한다
//수령액   =  월급 + 보너스 
//부서명   =  10:인사,20:자재,30:총무,40:연구개발,50:생산,60:서비스

//모든기능은 class에 구현한다.
//입력data
//사번,이름,입사일,월급,부서번호 


interface Emp {
	void input();
	void process();
	void output();
}

class EmployeeDto {
	// Fields
	// 입력data : 사번,이름,입사일,월급,부서번호
	// 			 emnum,name,emdate,salary,bunum
	private int emnum;
	private String name;
	private int emdate;
	private int salary;
	private int bunum;
	
	//출력		: 사번,이름,입사일,월급,보너스,수령액,부서명
	//									bonus,recieve,buname
	private double bonus;
	private double recieve;
	private String buname; // 근무연수에 따라 월급의 0.5%

	//Constructor
	public EmployeeDto() {}
	public EmployeeDto(int emnum, String name, int emdate, int salary, int bunum) {
		this.emnum = emnum;
		this.name = name;
		this.emdate = emdate;
		this.salary = salary;
		this.bunum = bunum;
		this.bonus = bonus;
		this.recieve = recieve;
		this.buname = buname;
	}

	// Getter/Setter
	public int getEmnum() {
		return emnum;
	}
	public void setEmnum(int emnum) {
		this.emnum = emnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmdate() {
		return emdate;
	}
	public void setEmdate(int emdate) {
		this.emdate = emdate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBunum() {
		return bunum;
	}
	public void setBunum(int bunum) {
		this.bunum = bunum;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getRecieve() {
		return recieve;
	}
	public void setRecieve(double recieve) {
		this.recieve = recieve;
	}
	public String getBuname() {
		return buname;
	}
	public void setBuname(String buname) {
		this.buname = buname;
	}

	// toString
	@Override
	public String toString() {
		return "EmployeeDto [emnum=" + emnum + ", name=" + name + ", emdate=" + emdate + ", salary=" + salary
				+ ", bunum=" + bunum + ", bonus=" + bonus + ", recieve=" + recieve + ", buname=" + buname + "]";
	}
	
}

// 기능
class Employee implements Emp{

	// Fields
	private EmployeeDto e;
	
	//메소드
	@Override
	public void input() {
		//키보드
		Scanner in = new Scanner(System.in);
		System.out.println("[사번,이름,입사일,월급,부서번호] 를 입력하시오");
		//                    0   1      2     3      4
		String line 	= in.nextLine();
		
		String [] li 	= line.trim().split(",");
		int emnum 		= Integer.parseInt(li[0]);
		String name 	= li[1];
		int emdate 		= Integer.parseInt(li[2]);
		int receive 	= Integer.parseInt(li[3]);
		int bunum 		= Integer.parseInt(li[4]);
		
		e = new EmployeeDto(emnum, name, emdate, receive, bunum);
		
	}

	@Override
	public void process() {
		//부서명   =  10:인사,20:자재,30:총무,40:연구개발,50:생산,60:서비스
		if(e.getBunum() == 10) {
			e.setBuname("인사");
		}	else {
			if(e.getBunum() == 20) {
				e.setBuname("자재");
			}	else {
				if(e.getBunum() == 30) {
					e.setBuname("총무");
				}	else {
					if(e.getBunum() == 40) {
						e.setBuname("연구개발");
					}	else {
						if(e.getBunum() == 50) {
							e.setBuname("생산");
						}	else {
							if(e.getBunum() == 60) {
								e.setBuname("서비스");
							}
						}
					}
				}
			}
		}	
		
	}

	@Override
	public void output() {
		//출력     : 사번,이름,입사일,월급,보너스,수령액,부서명
		
	}
	
}
public class TestEmployee {

	
	public static void main(String[] args) {
		
		System.out.println("난 벌레다");
	}

}
