package gagame;

import java.util.Random;
import java.util.Scanner;

public class character {
	int gorani = 0;
	int healthcnt = 100;
	double defend_vir = 10;
	Scanner in = new Scanner(System.in);
	String choice;
	endcredit end = new endcredit();
	Random ran = new Random();
	int rancnt = 0;
	String a = "����";
	int ten;
	int five;
	int minfive;
	int minten;

	int alcol_cnt = 0;
	int n = 0;
	int h = 0;
	int x = 0;
	function fun = new function();
	omicron omi = new omicron();

	public void omi_change() {
		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void da_u_hang() {
		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void only_nur() {
		if (n == 0) {
			defend_vir = 25;
		}
		n++;
	}

	public void only_hel() {
		if (h == 0) {
			healthcnt += 20;
			h++;
		}
	}

	public int x_mas(int x) {
		rancnt = ran.nextInt(5);
		if (rancnt >= 3) {
			end.hidden_x_mas_solo();
			return 1;
		} else {
			return 0;
		}

	}

	public String zibang(String b) {
		if (b.equals("����")) {
			return a = "����";
		} else if (b.equals("����")) {
			return a = "����";
		} else {
			return a = "����";
		}

	}

	public void witch() {
		if (a.equals("����") && x == 0) {
			defend_vir += 15;
			x++;
		}
		if (a.equals("����") && x == 0) {
			defend_vir += 50;
			x++;
		} else {
			defend_vir += 0;
		}
	}

	public void gori() {

		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void dume_sport_morning() {
		omi_change();
		da_u_hang();
		gori();
		witch();
		only_hel();

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"��ħ�� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" +"1. ��ħ� 2. ���� ��å���� 3. ��԰� ����ϱ�");
			choice = in.next();
			if (choice.equals("1")) {

				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"��� ���������!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"����� ���� ü�� ����! ");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"��ӿ� ������ �߳�...");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�� ����.... ");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"��å�� ���ٰ� ���� �����ƴ�!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"���� �����̿��� ���� ���� ��...");
					fun.timelate(1);
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"�ð��� ���⸦ �޾Ҵ�!!!");
					fun.timelate(1);
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221��
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"��ħ�� �߰���������!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�߰������� �Ծ� ü�°� �鿪�� ����!");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"�õ��ǿ� �߰������� �� ��������....");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +".........");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"��");
			}
		}

	}

	public void dume_sport_ohu() {

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"���ɿ� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" +" 1. ��? ������� � 2. �� �԰� � 3. �޽�!");
			choice = in.next();
			if (choice.equals("1")) {

				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�ð��� �꽺���� �ְ���!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"����� ü��");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"��� ������ ������ ���� �Ĵ��� ���� �Ǿ���.");
					fun.timelate(1);
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�ܹ����� ì��� ��ؾ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"��.. ��ҷ��� ��� ����� �ȵ�");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"���� ����ϰ� �԰� ��ؾ���!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�ټ��� �ߴ�");
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"zzZZ~ �� �����ϴ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"��..? �ټս��� ���ݾ�? �ȵŤ�������!");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"���� ��� ���� ���� �ؾ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�������� �����ϴ�");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"��");
			}
		}

	}

	public int dume_sport_night(int endcnt) {

		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"���ῡ ������ �� ���ΰ���?");
				System.out.println("\t\t\t\t\t\t" +" 1. ���� 2. ������ �ڱ� 3. ��갡��");
				choice = in.next();
				if (choice.equals("1")) {

					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"�ð��� �꽺���� �ְ���!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"����� ü��");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"�ڱ����� ��ϴ°� �ְ�!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"������ ���������� �ڱ������� ��� ����... ");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"�ð������ ���ļ� ������ �پ��!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"������ �پ�� ����� ���� ��������.");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"������ �������� ǫ ������.");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"���� �ְ��!");
						defend_vir += ten;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"��굵 �����!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"���� ���⸦ �޾� �鿪�� ");
						healthcnt += five;
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"���� �����ٰ� ���ϸ� ������.");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 0) {
							gorani = 1;
							break;
						} else {
							System.out.println("\t\t\t\t\t\t" +"��.....?");
							fun.timelate(1);
							System.out.println("\t\t\t\t\t\t" +"���ƾƾ���ƾƾ�!!!");
							healthcnt += minfive;
							defend_vir += minfive;
							System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
							System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
							status();
						}
					}

					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"��");
				}
			}
			if (gorani == 1) {
				end.gorani();
				endcnt = 1;
			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+  "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void dume_student_morning() {

		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"��ħ�� ������ �� ���ΰ���?");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"1.������ ��ҽ��ϴ� 2.���� ��� �����մϴ� 3.�İ� �Ϸ縦 �غ�����");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"���� ���ߵ˴ϴ�");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"������ ���� ������ �ʰ�.....");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"����������� �����ϴ� �ʹ� �����...");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221��
						+"\t\t\t\t\t\t" + "\r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
						+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
						+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
						+"\t\t\t\t\t\t" + "               =..........                        \r\n"
						+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
						+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
						+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
						+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
						+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
						+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
						+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
						+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
						+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
						+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
						+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
						+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
						+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
						+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
						+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
						+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
						+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
						+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
						+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
						+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
						+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
						+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
						+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
						+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
						+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
						+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
						+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
						+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
						+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
						+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
						+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
						+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
						+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
						+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
						+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "                                                  \r\n"
						+"\t\t\t\t\t\t" + "");
				System.out.println("\t\t\t\t\t\t" +"�����ˤ��ˤ������ˤ�������");
				fun.timelate(1);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"���� �߻���....");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221��
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"�߼Ҹ��� ������ �Ͼ�°ž߸��� �ǰ��� ì��� ��!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"���� Ʋ����");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"���Ϸ��� ���峪 �ü��� ���´�");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"���ƾƾƤ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�߶��� ���� �����ϰ� �ľ���!");
					fun.timelate(1);
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"��");
			}
		}

	}

	public void dume_student_ohu() {

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"���ɿ� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" +"1.���ɳ������Ա� 2.���ɽ��Ѽ��Ա� 3.���ɸ����Ա�");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"����ϰ� ������ �Ծ����");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�ð�¥���̾߸��� ��¥ ������");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"���Ը� �߸� ����..���ߴ�");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"��ΰ� ¥���� ��ų�� ���� «���� ��Ų��!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�����ߴ�!!!!");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");

					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"�������� ���ڷ���");
				fun.timelate(1);
				if (rancnt == 0) {

					System.out.println("\t\t\t\t\t\t" +"�������� ���ѸԾ���. ���̸��־�");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"�����ڰ� ö�̾ƴϾ�..");
					fun.timelate(1);
					healthcnt += minfive;

					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"�ƴϱٵ� ������ ��� �����Ծ�?");
				fun.timelate(1);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�츮�� ����� ���� ����");
					fun.timelate(1);
					healthcnt += ten;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"������ �ϴ� ������ ���� ���ߴ�....");
					fun.timelate(1);
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"�峭 ����!");
			}
		}

	}

	public int dume_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"�㿡�� ������ �Ұ��?");
				System.out.println("\t\t\t\t\t\t" +"1.���ڱ� 2.���Ա� 3.���ø��� ����");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					sleep();
					break;
				} else if (choice.equals("2")) {
					alcol_cnt++;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221��
								+"\t\t\t\t\t\t" + "\r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
								+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
								+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
								+"\t\t\t\t\t\t" + "               =..........                        \r\n"
								+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
								+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
								+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
								+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
								+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
								+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
								+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
								+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
								+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
								+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
								+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
								+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
								+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
								+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
								+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
								+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
								+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
								+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
								+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
								+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
								+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
								+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
								+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
								+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
								+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
								+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
								+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
								+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
								+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
								+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
								+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
								+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
								+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
								+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
								+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"���� �������� ����� ��ƿ��̴�");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"������� ������ ���R�R��");
						fun.timelate(1);
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"ģ�������� ���� ������ ����");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 0) {
							healthcnt += minfive;
							System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
							defend_vir += five;
							System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
							status();
						} else {
							gorani = 1;
							break;
						}
					}
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"�̰��� �������� ������ ���ϱ�...");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"�ϳ��� ������ �ھ���");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"������ ���� ���� ����..");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"���� �ھ���");
						fun.timelate(1);
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"�ٸ޴ٸ� �ٸ޿�");
				}

			}
			if (gorani == 1) {
				end.gorani();
				endcnt = 1;
			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void dume_nurse_morning() { // �θ� ��ȣ�� ��ħ
		only_nur();
		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "��ħ�� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" + "1. �� �԰� ����ϱ� 2. ����ϱ� 3. 10�� �� �ڰ� �����ϱ�");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "���̾�Ʈ ���ε� �ʹ� ���� �Ծ���ȴ�..");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"\r\n" // character 112��° ��
							+"\t\t\t\t\t\t" + "\r\n" + "                               *!                 \r\n"
							+"\t\t\t\t\t\t" + "                              !~!           -     \r\n"
							+"\t\t\t\t\t\t" + "                             *-~!         ,;~     \r\n"
							+"\t\t\t\t\t\t" + "                            ~,~~!   ~=!~,..,-     \r\n"
							+"\t\t\t\t\t\t" + "        ~-*=.      =..~=.   ;,~:!  !,,,,,,,,~     \r\n"
							+"\t\t\t\t\t\t" + "         :   ~-    -     :  -,;;; !,,,,,,,,,!     \r\n"
							+"\t\t\t\t\t\t" + "         .;    ;-:;;;-    -.~,~**.~-~~~~,,,-!     \r\n"
							+"\t\t\t\t\t\t" + "           ;  ;-   .,,.    :!-=,,~*:;;*,,,-~,     \r\n"
							+"\t\t\t\t\t\t" + "           *~-   *----~;*   $:!*-~::~,,,,~~$      \r\n"
							+"\t\t\t\t\t\t" + "         .:-~,  :,------~!  . :~~*;~~~~~~~!.      \r\n"
							+"\t\t\t\t\t\t" + "         !--~$ !.-------~~*    ,:,!*;::::!        \r\n"
							+"\t\t\t\t\t\t" + "        :---~$;.,--------~:~    .~,; !**          \r\n"
							+"\t\t\t\t\t\t" + "        $.$~~*:.---------~:=     .-,=             \r\n"
							+"\t\t\t\t\t\t" + "        ; =$:.,.-=!~--:=*~~:      !,--            \r\n"
							+"\t\t\t\t\t\t" + " -,~!.  ; =:=,~##-       .;!.     -,,!            \r\n"
							+"\t\t\t\t\t\t" + " ~...**-! *$ ;#$#:         -.      :,--           \r\n"
							+"\t\t\t\t\t\t" + ",.....:= $:   ###,         *       *,,=.          \r\n"
							+"\t\t\t\t\t\t" + "*......;; :   $##         ..       :,,!~.         \r\n"
							+"\t\t\t\t\t\t" + "; ......;* :  ~$.         !        ~,,! *         \r\n"
							+"\t\t\t\t\t\t" + "--:,*....-- ;  ;        .;         ~,,;  ~        \r\n"
							+"\t\t\t\t\t\t" + ",:*,;*...;,  *  .;    .$           ~,,:  ;        \r\n"
							+"\t\t\t\t\t\t" + ",;*.!!~..,.;  .    ,,.             ~,,;   ~       \r\n"
							+"\t\t\t\t\t\t" + "-!! !!*...;-                       ~,,;   :       \r\n"
							+"\t\t\t\t\t\t" + ";;*.*!*...*                        !,-!   .  ~:.  \r\n"
							+"\t\t\t\t\t\t" + "*....;....-                        !,~!    .   ,  \r\n"
							+"\t\t\t\t\t\t" + " ~.......;                         :~~;    ;-,$ ~*\r\n"
							+"\t\t\t\t\t\t" + " -:...,-!.                        :~~:.    ~   !--\r\n"
							+"\t\t\t\t\t\t" + "   :=!!,                          !~~*     ~~,.-  \r\n"
							+"\t\t\t\t\t\t" + "     !                            :~:.    ..      \r\n"
							+"\t\t\t\t\t\t" + "      .;               .         =~~=     ~       \r\n"
							+"\t\t\t\t\t\t" + "        :~             ~        .:~*      !       \r\n"
							+"\t\t\t\t\t\t" + "          ;~           *       ,=;*      ,        \r\n"
							+"\t\t\t\t\t\t" + "            .=.        $      -!;*.      ;        \r\n"
							+"\t\t\t\t\t\t" + "              .!*=;,   ***=,  $;*!      *         \r\n"
							+"\t\t\t\t\t\t" + "               ;;!**.,,=;;;!!;~~~$**=. !          \r\n"
							+"\t\t\t\t\t\t" + "               ;;!*:   :;;;!**   =***=-           \r\n"
							+"\t\t\t\t\t\t" + "               .,.     ,!!!*!.   $***;            \r\n" + "");
					System.out.println("\t\t\t\t\t\t" + "�������� �󸶳� �Դ°ž�!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "���� ��ħ�� ����ϰ� �Ծ����!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"  // 274 ��
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "         --                         ,             \r\n"
							+"\t\t\t\t\t\t" + "        ,#$*,               *;.:;-.!;             \r\n"
							+"\t\t\t\t\t\t" + "         :$@$,              @@$@@#$@-             \r\n"
							+"\t\t\t\t\t\t" + "           !@@              #@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            *@*             @@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            .#@             @@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@             *@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@           .:*@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@          :=@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@        .!@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       .=@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       ;@@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@      -@@@@@@@@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@      #@@@@@@@@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@     ~@@@@@@@@@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "             #@,    $@@@@@@@@@@@@@@*              \r\n"
							+"\t\t\t\t\t\t" + "             :@=   .#@@@@@@@@@@@@@@               \r\n"
							+"\t\t\t\t\t\t" + "              @#:  :@@@@@@@@@@@@@@-.              \r\n"
							+"\t\t\t\t\t\t" + "              ,#@!-=@@@@@@@@@@@@@@@@~             \r\n"
							+"\t\t\t\t\t\t" + "               -*@@@@@@@@@@@@@@@@@@@*             \r\n"
							+"\t\t\t\t\t\t" + "                .~::::::::::::::::::,             \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+ "");    
					System.out.println("\t\t\t\t\t\t" + "����ϴ� �濡 �Ϳ��� ����̸� �ô�!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + ten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "�ǰ��� �Ф� ����ϱ� �Ⱦ�");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "10�� �� �ܴٴ°� 2�ð� �� �ڹ��ȴ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "������ 15��... �� ���� �������� �帥��...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "������ �ߴµ� �ƹ��� ��ġä�� ���ߴ�!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "10�� �� �ڼ� �Ƿΰ� Ǯ�ȴ�");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "��");
			}
		}

	}

	public void dume_nurse_ohu() { // �θ� ��ȣ�� ����

		while (true) {
			System.out.println("\t\t\t\t\t\t" + "���ɿ� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" + "1. ��Ա� 2. �����ڱ� 3. ����ȸ������ ���ٶ���");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "����ϰ� ������ �Ծ����");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "�θ޻�� �ְ��� �������� ���� �Ծ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "����ؼ� ����� ����!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "����ȸ���� ��ġ�� �־ �ű⼭ ������ �Ծ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "���� ��ŵ��� ���ɸ����� �ʹ� ���� �ּŤ��������ض�..");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "�ʹ��ǰ���~ ���� ��ŵ�Ѵ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "zzZZ~ �� �����ϴ�!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "���� �ڼ� �����ϱ��ѵ� �ʹ� ����ļ� ���� ������...");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "���� ��ŵ����� �̻ݹ޴´�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "�뵷�� ����ֽŴ� ��� �ְ�~");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + ten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "���� ��ŵ����� ��ȥ�� ������? �󶼴� ���� �޺��� �¾Ҵ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "����ȸ������ �����ƴ�!");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minten + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "�峭 ����!");
			}
		}

	}

	public int dume_nurse_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" + "�㿡�� ������ �Ұ��?");
				System.out.println("\t\t\t\t\t\t" + "1.���ڱ� 2.���Ա� 3.���ø�������");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					sleep();

					if (rancnt == 0) {

						System.out.println("\t\t\t\t\t\t" + "������ ǫ ���");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "���� ����������~");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "���Ϸ��� ���峵�� ���� �ʹ� ���");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "������� ���鼭 ��� ���� �ɷȳ�..?");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					alcol();
					rancnt = ran.nextInt(2);

					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" + "���� ���ڿ��� ������ ģ��");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "���ַ� ���� ������ �ҵ��ߴ�");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + ten + "����!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "��... ���� �����..?");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 1) {
							System.out.println("\t\t\t\t\t\t" + "����.. ���� ��� ���Դ���...?");
							fun.timelate(1);
							System.out.println("\t\t\t\t\t\t" + "���� �ʹ� ���ż� �Ӹ��� ���� �� ����");
							healthcnt += minfive;
							System.out.println("\t\t\t\t\t\t" + "ü���� " + minfive + "����!");
							defend_vir += minfive;
							System.out.println("\t\t\t\t\t\t" + "�鿪���� " + minfive + "����!");
							status();
						} else {
							System.out.println("\t\t\t\t\t\t" +"����... ����??");
							fun.timelate(1);
							gorani = 1;
						}
					}
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"   // ���ø���
								+"\t\t\t\t\t\t" + " _   _        _     __  _  _       \r\n"
								+"\t\t\t\t\t\t" + "| \\ | |      | |   / _|| |(_)      \r\n"
								+"\t\t\t\t\t\t" + "|  \\| |  ___ | |_ | |_ | | _ __  __\r\n"
								+"\t\t\t\t\t\t" + "| . ` | / _ \\| __||  _|| || |\\ \\/ /\r\n"
								+"\t\t\t\t\t\t" + "| |\\  ||  __/| |_ | |  | || | >  < \r\n"
								+"\t\t\t\t\t\t" + "\\_| \\_/ \\___| \\__||_|  |_||_|/_/\\_\\\r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" + "�ƴ� �ð��� ����..?");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "���ø��� ���ٰ� �����̴�!");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + minten + "����!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "�鿪���� " + five + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"   // ���ø���
								+"\t\t\t\t\t\t" + " _   _        _     __  _  _       \r\n"
								+"\t\t\t\t\t\t" + "| \\ | |      | |   / _|| |(_)      \r\n"
								+"\t\t\t\t\t\t" + "|  \\| |  ___ | |_ | |_ | | _ __  __\r\n"
								+"\t\t\t\t\t\t" + "| . ` | / _ \\| __||  _|| || |\\ \\/ /\r\n"
								+"\t\t\t\t\t\t" + "| |\\  ||  __/| |_ | |  | || | >  < \r\n"
								+"\t\t\t\t\t\t" + "\\_| \\_/ \\___| \\__||_|  |_||_|/_/\\_\\\r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" + "������ ���ø����� �λ��� ������ �ȴ�!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" + "ü���� " + five + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" + "�ٸ޴ٸ� �ٸ޿�");
				}

			}
			if (gorani == 1) {
				end.gorani();
				endcnt = 1;
			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" + "�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public void nor_student_morning() {
		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"��ħ�� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" +"1.�Ͼ�� 2.�����ڱ� 3.��Ա�");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"�ϴ� �Ͼ�� �����غ���");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"��! ���� ���ݼ���!");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"�������� ����ް�~");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"������� ù���� 9��!");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"������ ������ ���..");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�׷��� ù������ 3��? ������!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"������ ���󿡼� ���� ����");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"������ 30��??�äӤ� �������� ���� �� ������� ��");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"������ ���.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�������� ����ް�!!!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�̰Ž� ������ �԰� ���� ���??");
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221��
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"���ߴ�....�̰����Ҿ���...");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"��ħ�� ����ϰ�!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"����");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"..............");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�̰��� ...����(��ګ)!!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"��");
			}
		}

	}

	public void nor_student_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"���ɿ� ������ �� ���ΰ���?");
			System.out.println("\t\t\t\t\t\t" +"1. �нĸԱ� 2. ����Ž�� 3. �����");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"����ϰ� ������ �Ծ����");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"������ �н� ���õ� �н�...");
					System.out.println("\t\t\t\t\t\t" +"�׸� �԰� �ʹ� ����..");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"�нĿ� ġŲ�� ���Դ�!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�̸��� �н� ����~");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"�����Ĵ翡�� Ȯ���ڰ� ���Դ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"Ȥ��.. ����?");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�α����� ������ ã�ư���");
					System.out.println("\t\t\t\t\t\t" +"����� ��á��");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪�� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"�Ľ�Ÿ�� ���� �� ������~");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"������ �ɾ ������ ã�ư��µ� ���� �ݾҴ�!");
					System.out.println("\t\t\t\t\t\t" +"���� �� ü�� ");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�������� �����ϴ� ���ھֶ� ��å�ߴ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"����");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"pc�濡�� ģ����� ������ �ߴ�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"���� ���� ���������̴�");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"���γ뷡�氡�� �뷡�Ƿ��� �˳´�");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"������ ������ ü�°��� ");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"�峭 ����!");
			}
		}
	}

	public int nor_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"�㿡�� ������ �Ұ��?");
				System.out.println("\t\t\t\t\t\t" +"1.�����ñ� 2.Ŭ������ 3.�����ϱ�");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					alcol();

					break;
				} else if (choice.equals("2")) {
					alcol();
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"�����ϴ��� �����..");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"���� �ؾ���..zzZZ~");
						System.out.println("\t\t\t\t\t\t" +"���� �ϴٰ� �� ����� ���ߴ�.");
						fun.timelate(1);
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
						status();
					}

					else {
						System.out.println("\t\t\t\t\t\t" +"�����ϴ� ���ھְ� ���� ��� �ش޶�� �ߴ�");
						System.out.println("\t\t\t\t\t\t" +"���� 2�� �ϴ��� �����");
						fun.timelate(1);
						System.out.print("\t\t\t\t\t\t" +"����.. �׷��� �ູ��...");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"�ٸ޴ٸ� �ٸ޿�");
				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void nor_sport_morning() {
//		end.test();
		omi_change();
		da_u_hang();
		only_hel();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"��ħ�� ������ �� ���ΰ���?");
			System.out.print("\t\t\t\t\t\t" +"1.��ħ�Ա� 2.����� 3.�ܹ��� ����ũ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"�Ĵ��� ��� �Ϻ�!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"\r\n" // character 112��° ��
							+"\t\t\t\t\t\t" + "\r\n" + "                               *!                 \r\n"
							+"\t\t\t\t\t\t" + "                              !~!           -     \r\n"
							+"\t\t\t\t\t\t" + "                             *-~!         ,;~     \r\n"
							+"\t\t\t\t\t\t" + "                            ~,~~!   ~=!~,..,-     \r\n"
							+"\t\t\t\t\t\t" + "        ~-*=.      =..~=.   ;,~:!  !,,,,,,,,~     \r\n"
							+"\t\t\t\t\t\t" + "         :   ~-    -     :  -,;;; !,,,,,,,,,!     \r\n"
							+"\t\t\t\t\t\t" + "         .;    ;-:;;;-    -.~,~**.~-~~~~,,,-!     \r\n"
							+"\t\t\t\t\t\t" + "           ;  ;-   .,,.    :!-=,,~*:;;*,,,-~,     \r\n"
							+"\t\t\t\t\t\t" + "           *~-   *----~;*   $:!*-~::~,,,,~~$      \r\n"
							+"\t\t\t\t\t\t" + "         .:-~,  :,------~!  . :~~*;~~~~~~~!.      \r\n"
							+"\t\t\t\t\t\t" + "         !--~$ !.-------~~*    ,:,!*;::::!        \r\n"
							+"\t\t\t\t\t\t" + "        :---~$;.,--------~:~    .~,; !**          \r\n"
							+"\t\t\t\t\t\t" + "        $.$~~*:.---------~:=     .-,=             \r\n"
							+"\t\t\t\t\t\t" + "        ; =$:.,.-=!~--:=*~~:      !,--            \r\n"
							+"\t\t\t\t\t\t" + " -,~!.  ; =:=,~##-       .;!.     -,,!            \r\n"
							+"\t\t\t\t\t\t" + " ~...**-! *$ ;#$#:         -.      :,--           \r\n"
							+"\t\t\t\t\t\t" + ",.....:= $:   ###,         *       *,,=.          \r\n"
							+"\t\t\t\t\t\t" + "*......;; :   $##         ..       :,,!~.         \r\n"
							+"\t\t\t\t\t\t" + "; ......;* :  ~$.         !        ~,,! *         \r\n"
							+"\t\t\t\t\t\t" + "--:,*....-- ;  ;        .;         ~,,;  ~        \r\n"
							+"\t\t\t\t\t\t" + ",:*,;*...;,  *  .;    .$           ~,,:  ;        \r\n"
							+"\t\t\t\t\t\t" + ",;*.!!~..,.;  .    ,,.             ~,,;   ~       \r\n"
							+"\t\t\t\t\t\t" + "-!! !!*...;-                       ~,,;   :       \r\n"
							+"\t\t\t\t\t\t" + ";;*.*!*...*                        !,-!   .  ~:.  \r\n"
							+"\t\t\t\t\t\t" + "*....;....-                        !,~!    .   ,  \r\n"
							+"\t\t\t\t\t\t" + " ~.......;                         :~~;    ;-,$ ~*\r\n"
							+"\t\t\t\t\t\t" + " -:...,-!.                        :~~:.    ~   !--\r\n"
							+"\t\t\t\t\t\t" + "   :=!!,                          !~~*     ~~,.-  \r\n"
							+"\t\t\t\t\t\t" + "     !                            :~:.    ..      \r\n"
							+"\t\t\t\t\t\t" + "      .;               .         =~~=     ~       \r\n"
							+"\t\t\t\t\t\t" + "        :~             ~        .:~*      !       \r\n"
							+"\t\t\t\t\t\t" + "          ;~           *       ,=;*      ,        \r\n"
							+"\t\t\t\t\t\t" + "            .=.        $      -!;*.      ;        \r\n"
							+"\t\t\t\t\t\t" + "              .!*=;,   ***=,  $;*!      *         \r\n"
							+"\t\t\t\t\t\t" + "               ;;!**.,,=;;;!!;~~~$**=. !          \r\n"
							+"\t\t\t\t\t\t" + "               ;;!*:   :;;;!**   =***=-           \r\n"
							+"\t\t\t\t\t\t" + "               .,.     ,!!!*!.   $***;            \r\n" + "");
					System.out.println("\t\t\t\t\t\t" +"�������� �󸶳� �Դ°ž�!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"������ �Ĵ� ������ �!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"�ʹ� ���� �Ծ� �������� ��������....");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"������ ����Ҵ� ��� ��������!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"����Ҹ� �ؼ� �ټս��� �Ͼ��..");
					healthcnt += minten;

					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"������ ������ �̼����� �־�.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"�ƴ�... ��Ʈ���ڸ� �ܹ��� ����ũ�� �� �ִ°���?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�̰��� �Ұ� ���̷����� �׿���...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"����� ����ũ �߶��ϰ� �Ծ����!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"����ǰ 3������ ����ũ�� �Ծ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�ż��� ���� �����̴�");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"��");
			}
		}
	}

	public void nor_sport_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"���ɿ� ������ �� ���ΰ���?");
			System.out.print("\t\t\t\t\t\t" +"1.���ɸԱ� 2.�߷� 3.�Ǹ�");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"����ϰ� ������ �Ծ����");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"ġ�õ��̶� �⸧�� ��¥���� �񺭸Ծ���");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"����� ���� ���������� �����ߴ�!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"�Ĵܰ������̶� �����常 �Ծ���.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"�������� ���⼭ ��...??");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221��
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"�� �� �� �� �� �� �� �� �� �� �� ��");
					
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"������ ���� ���� ���ָ� �޾� �鿪�� ����!!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"���� �� �װ��� ���� �θ�");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"   // 398   // 517
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                   .;=$=~         \r\n"
							+"\t\t\t\t\t\t" + "                                 :=$$:~~*#.       \r\n"
							+"\t\t\t\t\t\t" + "                                **.,=;   -$       \r\n"
							+"\t\t\t\t\t\t" + "       .~=#$$$=-               ~$    =-   :!      \r\n"
							+"\t\t\t\t\t\t" + "      .=~**   -#-             .=.    ,*    #~     \r\n"
							+"\t\t\t\t\t\t" + "     .#-  =!   .#             ,;      *;    !     \r\n"
							+"\t\t\t\t\t\t" + "     =~    !-   ~*            $-      .$    =     \r\n"
							+"\t\t\t\t\t\t" + "    .;     ,#    #-           @   .    =~   ;,    \r\n"
							+"\t\t\t\t\t\t" + "    $-      !;   ,;          ;=  ;!*.  -~   :*    \r\n"
							+"\t\t\t\t\t\t" + "   .#        $    =          !.  * ~!  ,:   .@    \r\n"
							+"\t\t\t\t\t\t" + "   ;*  -;-   =-   !.         !  :;  $  ,*    #    \r\n"
							+"\t\t\t\t\t\t" + "   !.  $,=,  ~~   ;~         *  #-  =. .$    #    \r\n"
							+"\t\t\t\t\t\t" + "   *  ~; ~;  ,~   -$  .,-~~~~$*===! *:  =    #.   \r\n"
							+"\t\t\t\t\t\t" + "  .=  @. .$  -;   .@=$$$*;~---,.. *:;!  *    #,   \r\n"
							+"\t\t\t\t\t\t" + "  .=  @   $  ,!    @               *;!  *    #-   \r\n"
							+"\t\t\t\t\t\t" + "  ,*  @   $. ,*    @              ,*!;  *    #-   \r\n"
							+"\t\t\t\t\t\t" + "  ,* .@   $, ,=    @       ..,.-;$#,=-  *    #-   \r\n"
							+"\t\t\t\t\t\t" + "  ,* .@   $. .=    @.,:!!!*=*$::=*. $   =    #.   \r\n"
							+"\t\t\t\t\t\t" + "  ,=  @   $  .=    @##*~     !. .! ,$  .$    #.   \r\n"
							+"\t\t\t\t\t\t" + "  .=  @   $  ,=    @         ;;  *~*-  ,*    #    \r\n"
							+"\t\t\t\t\t\t" + "   *  #~ ,#  ,!    @         ,@  .$;   ,~   ,@    \r\n"
							+"\t\t\t\t\t\t" + "   *  .! :~  ,;   .@          @.       -:   :;    \r\n"
							+"\t\t\t\t\t\t" + "   !-  !=*   -~   -#          :;       $-   !.    \r\n"
							+"\t\t\t\t\t\t" + "   ~$   ~    ~~   ;:           *      .$   .=     \r\n"
							+"\t\t\t\t\t\t" + "    @.       =-   !            ;*     *~   $-     \r\n"
							+"\t\t\t\t\t\t" + "    !:       $   .=             =;.  :$.,-=~      \r\n"
							+"\t\t\t\t\t\t" + "    .=      !;   *:             .;===@$$!~,       \r\n"
							+"\t\t\t\t\t\t" + "     :=    .=  .!$.                               \r\n"
							+"\t\t\t\t\t\t" + "      :=:,:=!!!=;                                 \r\n"
							+"\t\t\t\t\t\t" + "       ,=@@@$;.                                   \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"������ �߿� ����߷����Ǵ�.....����");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"���� ��ǥ�� ����Ƹ� �����ؼ��� ��̴�!");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"������ �Ǹ��� ����� �ƴұ�?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"��� ������ ���ô� ���ɸ��� ������ ����");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"��ȣ��(������) 100�� ����");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"������ ��� ������ ���� �˴ϴ�.");
					healthcnt += ten;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"��ó ȣ�������� ������ �����Ϸ� ����.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"\r\n"  // 274 ��
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "         --                         ,             \r\n"
							+"\t\t\t\t\t\t" + "        ,#$*,               *;.:;-.!;             \r\n"
							+"\t\t\t\t\t\t" + "         :$@$,              @@$@@#$@-             \r\n"
							+"\t\t\t\t\t\t" + "           !@@              #@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            *@*             @@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            .#@             @@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@             *@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@           .:*@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@          :=@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@        .!@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       .=@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       ;@@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@      -@@@@@@@@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@      #@@@@@@@@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@     ~@@@@@@@@@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "             #@,    $@@@@@@@@@@@@@@*              \r\n"
							+"\t\t\t\t\t\t" + "             :@=   .#@@@@@@@@@@@@@@               \r\n"
							+"\t\t\t\t\t\t" + "              @#:  :@@@@@@@@@@@@@@-.              \r\n"
							+"\t\t\t\t\t\t" + "              ,#@!-=@@@@@@@@@@@@@@@@~             \r\n"
							+"\t\t\t\t\t\t" + "               -*@@@@@@@@@@@@@@@@@@@*             \r\n"
							+"\t\t\t\t\t\t" + "                .~::::::::::::::::::,             \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+ "");    
					System.out.println("\t\t\t\t\t\t" +"�������� ���������� �ɳɽ����ø� ���ߴ�");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"�峭 ����!");
			}
		}

	}

	public int nor_sport_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"�㿡�� ������ �Ұ��?");
				System.out.print("\t\t\t\t\t\t" +"1.���ڱ� 2.Ŭ������ 3.�������� ��Ʃ�꺸��");
				choice = in.next();
				if (choice.equals("1")) {
					sleep();

					break;
				} else if (choice.equals("2")) {
					System.out.println("\t\t\t\t\t\t" +"��â�� Ŭ���� '�ｺ'Ŭ������");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"����ũ�� �����ϰ� ���Դ�..!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"����ũ�� �������� �͵� ��̴�");
						healthcnt += five;
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"�� ��ǥ�� ����Ƹ�");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"���� �ｺ�忡 ����̸���");
						healthcnt += ten;
						defend_vir += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"ģ������ ��ȭ���Դ�");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"��...������...��ƾ�� ���� ���°�?");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						status();
					}

					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"���Z������ ���� 4�ð��Ǿ���.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"\"���������̶� ���� �޴� �ڱ�...¥���آ�\"");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"���Z������ ���� 4�ð��Ǿ���.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"����ģ ������ �ټս��� �����մϴ�...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312��
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"�������� ��Ʃ��� �λ��� ������ �ȴ�!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"�ٸ޴ٸ� �ٸ޿�");
				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
//			if (alcol_cnt == 3) {
//				end.hidden_Alcohol();
//				endcnt = 1;
//			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");

			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public int backsin() {
		int endcnt = 0;
		System.out.println("\t\t\t\t\t\t" +"������ ��� ������ ���̴�");
		System.out.println(" ");
		fun.timelate(1);
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"������ �ұ��?");
			System.out.print("\t\t\t\t\t\t" +"1.��Ÿ±� 2.��Ÿ±� 3.��Ÿ±�");
			choice = in.next();
			if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"���� ���� ����� ȭ����");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"25���� ġ������ ������ �ִ�.");
					fun.timelate(1);
					rancnt = ran.nextInt(4);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"die");
						end.hidden_bacsin();
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" +"���� ������ ������ ��ĥ ���������� ����������!!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "�����ߴ�.");

					}
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"���� ���� ����� �����");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"33���� ġ������ ������ �ִ�.");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						end.hidden_bacsin();
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" +"���� ������ ������ ��ĥ ���������� ����������!!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "�����ߴ�.");

					}
				}

				break;
			}

			else {
				System.out.println("\t\t\t\t\t\t" +"xxxxxxxxxxxx");
			}
		}

		return endcnt;
	}

	public void seoul_nur_mornig() {
		omi_change();
		da_u_hang();
		only_nur();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"��ħ�� ������ �� ���ΰ���?");
			System.out.print("\t\t\t\t\t\t" +"1.����ϱ� 2.�վİ� ����ϱ� 3.��ħ�� ����ϰ�");
			choice = in.next();
			if (choice.equals("1")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"����� �ǰ��� �طӽ��ϴ�");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");

					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"��ٱ濡 ���踦 ���� ���� Ÿ�� ���� �Խ��ϴ�!");
					System.out.println("\t\t\t\t\t\t" +"����� ��������!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü����" + five + "����!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    // 758
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                ,-           .;;!-                \r\n"
							+"\t\t\t\t\t\t" + "             .-=!!*;.       :*!:;!;.              \r\n"
							+"\t\t\t\t\t\t" + "             !!,  .~!-     !:.    :!,            .\r\n"
							+"\t\t\t\t\t\t" + "           .=:      ,!.   ;;       ;;             \r\n"
							+"\t\t\t\t\t\t" + "          .!;       -,.,- -,        ;;            \r\n"
							+"\t\t\t\t\t\t" + "         .:!       .  ,.  ,..       .*-           \r\n"
							+"\t\t\t\t\t\t" + "         -=.       - -@: ,@:,        -!           \r\n"
							+"\t\t\t\t\t\t" + "         ;~        ,  ~.  ~,,         !,          \r\n"
							+"\t\t\t\t\t\t" + "        -;        .::.-~:.-:~         -*          \r\n"
							+"\t\t\t\t\t\t" + "        =-       .::::::::::::         *~         \r\n"
							+"\t\t\t\t\t\t" + "       :*        ,::::::::::::.        ::         \r\n"
							+"\t\t\t\t\t\t" + "       :.        ;:::::::::::::         *         \r\n"
							+"\t\t\t\t\t\t" + "      .*        ~::::::::::::;;-        ;         \r\n"
							+"\t\t\t\t\t\t" + "      ,-        ::;;:::::::::;::        ~-        \r\n"
							+"\t\t\t\t\t\t" + "      *,       ,:::*!::::::;;;::,       ~*        \r\n"
							+"\t\t\t\t\t\t" + "      *        ~::::*=;;;;;*::::-        *        \r\n"
							+"\t\t\t\t\t\t" + "     -*        ::::::;*!!!;:::::;        *        \r\n"
							+"\t\t\t\t\t\t" + "     ;,       !::::::::::::::::::,       =,       \r\n"
							+"\t\t\t\t\t\t" + "     ;       -::::::::::::::::::::       ::.      \r\n"
							+"\t\t\t\t\t\t" + "     ;       ;;:::::::::::::::::::-      .;       \r\n"
							+"\t\t\t\t\t\t" + "    .:      -*;;::::::::::::::::::~       :       \r\n"
							+"\t\t\t\t\t\t" + "    ,-      $*!!!:::::::::::::::;!=       :       \r\n"
							+"\t\t\t\t\t\t" + "    ,-     -==!!!!!;;;;::::;;;;!!!*~      ;       \r\n"
							+"\t\t\t\t\t\t" + "    .-     :=*$*!!!!!!!!!!!!!!!!!**$      :       \r\n"
							+"\t\t\t\t\t\t" + "    .-     ==!!*===!!!!!!!!!!!*!!!*=,     :       \r\n"
							+"\t\t\t\t\t\t" + "    .,     $$*!!!!*$#$==*=$$*!!!!!*=:     :       \r\n"
							+"\t\t\t\t\t\t" + "    ..    :=$**=!!!!!!!!!!!!!!!!!!*=~     ;       \r\n"
							+"\t\t\t\t\t\t" + "    .     $==!!!$$!!!!!!!!!!!!**!!*=!     ;       \r\n"
							+"\t\t\t\t\t\t" + "    ,     $=$!!!!!===*********!!!!*==     ;       \r\n"
							+"\t\t\t\t\t\t" + "    ,     ===$!!!!!!!!!!!!!!!!!!!!*=$     ;       \r\n"
							+"\t\t\t\t\t\t" + "    ,    ,==$*===*!!!!!!!!!!!!!*!!*=$     :       \r\n"
							+"\t\t\t\t\t\t" + "    ,    ~==$*!!!=#=!!!!!!!!!=*!!!==$     ,       \r\n"
							+"\t\t\t\t\t\t" + "    .    ~====!!!!!*====*==*!!!!!!==$             \r\n"
							+"\t\t\t\t\t\t" + "    .    ~===$$!!!!!!!!!!!!!!!!!!!==$    .        \r\n"
							+"\t\t\t\t\t\t" + "         ,====!===*!!!!!!!!!!!*!!*==$    -        \r\n"
							+"\t\t\t\t\t\t" + "     .    =====!!!=$$=**!**==!!!!===*    !        \r\n"
							+"\t\t\t\t\t\t" + "     .    $====*!!!!!****!!!!!!!*===;    :        \r\n"
							+"\t\t\t\t\t\t" + "     ,    $====*=$!!!!!!!!!!!!*!====:             \r\n"
							+"\t\t\t\t\t\t" + "    ..    *=====!!==*******!*!!!====~   .         \r\n"
							+"\t\t\t\t\t\t" + "    ..    ,=====*!!!!!***!!!!!!=====.   ,         \r\n"
							+"\t\t\t\t\t\t" + "           $=====**!!!!!!!!!!!*=====    .         \r\n"
							+"\t\t\t\t\t\t" + "           ;======*$=!!!!!!**!=====,              \r\n"
							+"\t\t\t\t\t\t" + "     .     :======!!!*===*!!!*=====     ,         \r\n"
							+"\t\t\t\t\t\t" + "     .      $======!!!!!!!!!*=====:               \r\n"
							+"\t\t\t\t\t\t" + "     .      ;======**!!!!!!!======,               \r\n"
							+"\t\t\t\t\t\t" + "      .      =======***=**!======:                \r\n"
							+"\t\t\t\t\t\t" + "             ~======$*!!!*======*                 \r\n"
							+"\t\t\t\t\t\t" + "             .$========*========,                 \r\n"
							+"\t\t\t\t\t\t" + "               *=======!$======:                  \r\n"
							+"\t\t\t\t\t\t" + "               ,$=====- ======~                   \r\n"
							+"\t\t\t\t\t\t" + "                 !!!*,   ;!!!.                    \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"���� ȭ��ǿ��� ���������� �߰�!");
					System.out.println("\t\t\t\t\t\t" +"���� �׸� ������ �Ҿ���ȴ�...");
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"�ǰ��� ì���!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
					status();
				}

				break;

			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"���� ���� ������ ���Ѱ� ����... ���� �̻��ϴ�...");
					healthcnt -= ten;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
					status();
				}

				else {
					System.out.println("\t\t\t\t\t\t" +"��ħ�� ���� ����� ��������!!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"�ٽð���� ����");
				fun.timelate(1);
			}
		}

	}

	public void seoul_nur_afternoon() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"���ɿ� ������ �Ұǰ���?");
			rancnt = ran.nextInt(10);
			if (rancnt == 0) {
				fun.timelate(1);
				System.out.println("\t\t\t\t\t\t" +"������ �з���� ȯ�ڿ� ���� ���� ȯ�ڸ� ���� �Ǿ���.");
				fun.timelate(1);
				healthcnt += minten;
				System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
				status();
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"1.��Ա� 2.�����ڱ� 3.���ٶ���");
				choice = in.next();
				if (choice.equals("1")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"���� ���ְ� �Ծ���!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"���� ���ϰ� �Դ� ü�ع��ȴ�...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"�����̾߸��� �����ְ��� �ð�!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"������ �� ����ȣ��Բ� ȥ����....");
						System.out.println("\t\t\t\t\t\t" +"������ Ÿ���� �����");
						healthcnt += minfive;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"���� ����ģ���� �����޽��� ��������ٳ� ����");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"¦���̿���--(����ü�� ����)");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"�ð������� �𸣰� �־���! �Ҽ��� �ູ");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"��");
					fun.timelate(1);
				}
			}

		}

	}

	public int seoul_nur_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"�㿡�� ������ �Ұ��?");
//				rancnt = ran.nextInt(2);
//				if (rancnt == 0) {
//					fun.timelate(1);
//					System.out.println("�׷��� ������ �߱��ϴ³� ��");
//					healthcnt += minten;
//					defend_vir += minfive;
//					System.out.println("ü���� " + minten + "����!");
//					System.out.println("�鿪���� " + minfive + "����!");
//					status(healthcnt, defend_vir);
//					break;
//				} else {
				System.out.print("\t\t\t\t\t\t" +"1.���ڱ� 2.���Ա� 3.��Ʃ�꺸��");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					sleep();

					break;
				} else if (choice.equals("2")) {
					alcol();
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312��
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"���Z������ ���� 4�ð��Ǿ���.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"�ϳ��� �������ھ���");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minfive + "����!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312��
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"������ ��Ʃ��� �λ��� ������ �ȴ�!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"�ٸ޴ٸ� �ٸ޿�");
				}

//				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"�ڷγ� �˻���..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%�� Ȯ���� �ڷγ��� �ɷȽ��ϴ�" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%�� Ȯ���� ���� ��Ƴ��ҽ��ϴ�." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public void nurse_baksin() {
		System.out.println("\t\t\t\t\t\t" +"������ ��� ������ ���̴�");
		System.out.println(" ");
		fun.timelate(1);
		int cnt = 0;
		while (cnt == 0 || cnt == 1) {

			if (cnt == 0) {
				System.out.println("\t\t\t\t\t\t" +"����ߴ�!!");
				fun.timelate(1);
			}
			if (cnt == 1) {
				System.out.println("\t\t\t\t\t\t" +"���� �԰� �Դ�");
				fun.timelate(1);
			}
			System.out.println("\t\t\t\t\t\t" +"������ �ұ�?");
			System.out.println("\t\t\t\t\t\t" +"1.��� �����ֱ� 2.��� ����ֱ� 3.��� �����ֱ�");
			choice = in.next();
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				System.out.println("\t\t\t\t\t\t" +"ȯ�� ����! ��� ȯ�ڰ� �ʹ� �����ϴ�!!");
				healthcnt += minfive;
				System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
				status();
			} else {
				System.out.println("\t\t\t\t\t\t" +"������ ȯ�ڰ� ���� �Ȱ�Ŵ� ����!");
				healthcnt += five;
				System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
				status();
			}
			cnt++;
		}
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"�����̴�...");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"1.��� �����ֱ� 2.��� �����ֱ� 3.���Ա�");
			choice = in.next();
			if (choice.equals("3")) {
				alcol();
				break;
			} else if (choice.equals("1") || choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"ȯ�� ����! ��� ȯ�ڰ� �ʹ� �����ϴ�!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"������ ȯ�ڰ� ���� �Ȱ�Ŵ� ����!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
					status();
				}
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"���� �� �ֱ⼱���� �̰Ǹ𸣰ٿ� ����");
			}
		}
	}

	public void status() {

		System.out.println("\t\t\t\t\t\t" +"================================");
		System.out.println("\t\t\t\t\t\t" +"ü�� >> " + healthcnt);
		System.out.println("\t\t\t\t\t\t" +"���� ���׷� >> " + defend_vir);
		System.out.println("\t\t\t\t\t\t" +"================================");
		System.out.println(" ");

		fun.timelate(1);

	}

	public void sleep() {
		rancnt = ran.nextInt(3);
		System.out.println("\t\t\t\t\t\t" +"�������");
		fun.timelate(1);
		if (rancnt == 0) {

			System.out.println("\t\t\t\t\t\t" +"������ ���");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"ü���� " + ten + "����!");
			System.out.println("\t\t\t\t\t\t" +"�鿪���� " + ten + "����!");
			healthcnt += ten;
			defend_vir += ten;
			status();
		} else if (rancnt == 1) {
			System.out.println("\t\t\t\t\t\t" +"�Ǹ��� �f��");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"�ͽ��� ���켺 �Źξƴ�...��...������");
			healthcnt += five;
			System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
			status();
		} else {
			System.out.println("\t\t\t\t\t\t" +"������ ����");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"ü���� " + minten + "����!");
			healthcnt += minten;
			defend_vir += ten;
			System.out.println("\t\t\t\t\t\t" +"�鿪���� " + minten + "����!");
			status();
		}

	}

	public void alcol() {
		alcol_cnt++;
		System.out.println("\t\t\t\t\t\t" +"�����Դ´�?");
		rancnt = ran.nextInt(2);
		if (rancnt == 0) {
			System.out.println("\t\t\t\t\t\t" +"���� ������ ���ڿ÷� �ҵ��Ͽ���.");
			healthcnt += five;
			defend_vir += five;
			System.out.println("\t\t\t\t\t\t" +"ü���� " + five + "����!");
			System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
			status();

		} else {
			System.out.println("\t\t\t\t\t\t" +"������ ���ִ� �ǰ��� �ط���..");
			healthcnt += minfive;
			defend_vir += five;
			System.out.println("\t\t\t\t\t\t" +"�鿪���� " + five + "����!");
			System.out.println("\t\t\t\t\t\t" +"ü���� " + minfive + "����!");
			status();
		}
	}

	public double corona_persent(double defend_vir) {
//		double corona_persent = 0;
//		double corona_persent =100;
		if (defend_vir >= 100) {
			double corona_persent = 0;
			return corona_persent;
		}
//		else if (defend_vir <= 0) {
//			double corona_persent = 10;
//			return corona_persent;
//		}
		else {
			double corona_persent = 10 - (10 * (defend_vir / 100));
			return corona_persent;
		}
	}

}
