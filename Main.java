package gagame;

import java.util.ArrayList;
import java.util.Scanner;

import DB.DBDAO;
import DB.loginMethod;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		function fun = new function();
		String mychar[] = { "0" };
//		while(true) {
//			
//			System.out.println("���� ����");
//			System.out.println("1���� ��â,2���� ���,3���� ũ��������,"+"\n"
//					+ "4�븻 �л�,5�븻 �,6�븻 ��ȣ��,"+"\n"
//					+ "8��忣�� �ڷγ�,9��忣�� ���̹��̷���,10 ��忣�� ����"+"\n"
//					+ "11.���� ���ڿ� , "
//					+  , 15.���Ͽ��� );
//			int x = in.nextInt();
//			onlyend(x);
//			
//			if(x==100) {
//				break;
//			}
//			else {
//			fun.timelate(2);
//			}
//		}
		// ������� ������ ���� ���� ��â ���� ���xx ũ��������
		// ��忣�� ���λ� �ڷγ� ���̹��̷���
//		System.out.println("������!");

		DBDAO dao = new DBDAO();
		loginMethod db = new loginMethod();
//		ArrayList<MemberDTO> list = dao.selectAll(); 

		db.db();
		System.out.println();
		System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
		fun.timelate(1);
		System.out.println("\t\t\t\t" + " �ڷγ� ���������� ���� ���ѹα��� �ɰ��� ħü�⸦ �ް� �ִ�... ");
		fun.timelate(1);
		System.out.println("\t\t\t\t" + " 2021��... ����� �ڷγ��� �ɸ��� �ʰ� ���ѹα����� ��Ƴ����� ���� ���ΰ�...  ");
		fun.timelate(1);
		System.out.println("\t\t\t\t" + " ȭ���� ��ħ�޻��� ���� ���δ� ���... �����߸� �Ϸ��� �ϰ��� �����ϰ� �ȴ�... ");
		System.out.println("");

		seoul se = new seoul();
		while (true) {
			charchoice(mychar);

			System.out.println("\t\t\t\t\t\t" + "========���ø� ������========");
			System.out.println("\t\t\t\t\t\t" + "===========================");
			System.out.println("\t\t\t\t\t\t" + "1.������  2.���� 3.������ �θ޻��");
			System.out.print("\t\t\t\t\t\t" + "(Hell) (Normal) (���־ֱ�����)");
			String choice = in.next();
			if (choice.equals("1")) {
				se.main(mychar);
				break;
			} else if (choice.equals("2")) {
				se.zibang(mychar);
				break;
			} else if (choice.equals("3")) {
				se.dume(mychar);
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "�峭 ����");
			}

		}
//		se.main();
//		in.close();
	}

	static void onlyend(int x) {
		endcredit end = new endcredit();

		if (x == 1) {
			end.hidden_healcang();
		}
		if (x == 2) {
			end.hidden_bacsin();
		}
		if (x == 4) {
			end.normal_student_end();
		}
		if (x == 3) {
			end.hidden_x_mas_solo();
		}
		if (x == 9) {
			end.bad_omicron_die();
		}
		if (x == 11) {
			end.hidden_Alcohol();
		}
		if (x == 7) {
			end.event_hi_omicron();
		}
		if (x == 8) {
			end.bad_corona_end();
		}
		if (x == 5) {
			end.normal_sport_end();
		}
		if (x == 10) {
			end.bad_overwork();
		}
		if (x == 6) {
			end.normal_nurse_end();
		}
		if (x == 12) {
			end.normal_nurse_end2();
		}
		if (x == 13) {
			end.event_u_hang();
		}
		if (x == 14) {
			end.goridugi();
		}
		if (x == 15) {
			end.gorani();
		}
		if (x == 16) {
			end.test();
		}

	}

	static void charchoice(String mychar[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "=======ĳ���͸� ������=======");
			System.out.println("\t\t\t\t\t\t" + "===========================");
			System.out.println("\t\t\t\t\t\t" + "1.��ȣ�� >> ü��(����) �������ס�");
			System.out.println("\t\t\t\t\t\t" + "��ȣ���� Ư¡ : ������");
			System.out.println("\t\t\t\t\t\t" + "2.����� >> ü�¡�  ��������(����)");
			System.out.println("\t\t\t\t\t\t" + "������� Ư¡ : ü�¸���");
			System.out.println("\t\t\t\t\t\t" + "3.�л� >> ü��(����)  ��������(����)");
			System.out.print("\t\t\t\t\t\t" + "�л��� Ư¡ : Ư¡���� Ư¡");
			mychar[0] = in.next();
			if (mychar[0].equals("1") || mychar[0].equals("2") || mychar[0].equals("3")) {
				if (mychar[0].equals("1")) {
					System.out.print("\t\t\t\t\t\t" + "��ȣ�� ");
					System.out.println("\r\n" // ��ȣ�� ����
							+ "\t\t\t\t\t\t" + "                              \r\n" + "\t\t\t\t\t\t"
							+ "          ~@@@@@@@@#          \r\n" + "\t\t\t\t\t\t"
							+ "          ;@  @@- @*          \r\n" + "\t\t\t\t\t\t"
							+ "         @ =@@@@@@@ =!        \r\n" + "\t\t\t\t\t\t"
							+ "        @      .@:   @        \r\n" + "\t\t\t\t\t\t"
							+ "        @ :@@@,   $@~@        \r\n" + "\t\t\t\t\t\t"
							+ "       @~!          -@@       \r\n" + "\t\t\t\t\t\t"
							+ "        @@          !@-       \r\n" + "\t\t\t\t\t\t"
							+ "       ,@:@        =$;!       \r\n" + "\t\t\t\t\t\t"
							+ "        @  ;@$;;=@=  @,       \r\n" + "\t\t\t\t\t\t"
							+ "          -~@    @~~          \r\n" + "\t\t\t\t\t\t"
							+ "    -#@@$:@-  *=   @~=@@@~    \r\n" + "\t\t\t\t\t\t"
							+ "  #=       -@~  ,@*       :@  \r\n" + "\t\t\t\t\t\t"
							+ " :=           -$           ~= \r\n" + "\t\t\t\t\t\t"
							+ " *!   @       -$ ,@@@= @   .$ \r\n" + "\t\t\t\t\t\t"
							+ " *!   @       -$       @   .$ \r\n" + "\t\t\t\t\t\t" + "      ~        .       :    , ");
				} else if (mychar[0].equals("2")) {
					System.out.print("\t\t\t\t\t\t" + "����� ");
					System.out.println("\t\t\t\t\t\t" + "\r\n" + "                                              \r\n"
							+ "\t\t\t\t\t\t" + "                      ;!;;!-                      \r\n" + "\t\t\t\t\t\t"
							+ "            .        *~    ;-       ..            \r\n" + "\t\t\t\t\t\t"
							+ "          ~;;;      ~-      *,     ,;!;           \r\n" + "\t\t\t\t\t\t"
							+ " ;********!  ~******!       ,*******. ~*********, \r\n" + "\t\t\t\t\t\t"
							+ ",:      .;   .~     :       .~     ;   .!      .; \r\n" + "\t\t\t\t\t\t"
							+ ".!      ,:   .!     :       .~    ~:   .!      ,; \r\n" + "\t\t\t\t\t\t"
							+ " -~~*~~~~; .~::~~~~~;       ,;~~~~~!:- .;~~~;;~~. \r\n" + "\t\t\t\t\t\t"
							+ "    *    : ,:       ~.      *,       ; .;   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   !- ,-       ,!     -;        ;  ;   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   *  ,,        ~;   .*         !  :~  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  -;  -,         ;   .-         !. .*  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  ~.  ~,      .!*:   .**:       ;,  *, ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  !   -,     :;,        ~*.     !.  -~ ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  !   ,,  . !:           .!. .  !    ~ ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  !   -*;;;;:    .   ,    ,;;;;!!.  .~ ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  :    .         -,  !         ..   !- ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  ~-             -,  !              *  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  .*             -,  !             ~;  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   *.            -,  !             :   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   ,!-.         ~;.  ~;.         .::   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *    ,!***;.   !*!.    ~!*   .~***!:    ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *         ,~;               :;-.        ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *           ,*             ~!           ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            -~            ;            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             ;           -~            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             :           ;-            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             :           !-            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             ~           *.            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *************=*            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *.............:            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *             :            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *,,,,,,,,,,,,,;            --    \r\n" + "\t\t\t\t\t\t"
							+ "    ,            ,,,,,,,,,,,,,,,                  ");
				} else {
					System.out.print("\t\t\t\t\t\t" + "�л� ");
					System.out.println("                      \r\n"
							+ "                                                        .=-* * * **:!         \r\n"
							+ "\t\t\t\t\t\t" + "        =         -!        \r\n" + "\t\t\t\t\t\t"
							+ "       .!          =        \r\n" + "\t\t\t\t\t\t" + "        ;-  ****   !-        \r\n"
							+ "\t\t\t\t\t\t" + "         .=~    ;=          \r\n" + "\t\t\t\t\t\t"
							+ "        ,::~,-,-:::.        \r\n" + "\t\t\t\t\t\t" + "    ,=*- =. ~=  =  :*=.    \r\n"
							+ "\t\t\t\t\t\t" + "  ;:      ,* *. =       *,  \r\n" + "\t\t\t\t\t\t"
							+ " .=                      .=  \r\n" + "\t\t\t\t\t\t" + "-=.    ,            ~    ,=.\r\n"
							+ "\t\t\t\t\t\t" + "~=~. -=:            ==. .;=,\r\n" + "\t\t\t\t\t\t"
							+ " !..*;~:            =.!: .; \r\n" + "\t\t\t\t\t\t" + " =. -*-:            = *- .* \r\n"
							+ "\t\t\t\t\t\t" + " =. -*-:            = *, .* \r\n" + "\t\t\t\t\t\t"
							+ " .---  :;;;;;;;;;;;;~ .---  ");
				}
				System.out.println("\t\t\t\t\t\t" + "���� �Ϸ�!");
				break;
			} else {
				System.out.println(mychar[0]);
				mychar[0] = "0";
				System.out.println("\t\t\t\t\t\t" + "�̻��ѰŴ� �ٸ޴ٸޡ�");

			}
		}
//		in.close();
	}
}
