package LL;

import java.util.LinkedList;

public final class Test {



        public static void main(String[] args) {

            LinkedList<String> list = new LinkedList<>();



            list.add("First value");

            list.add("Second value");

            list.add("Third value");



            System.out.println("������ ������: " + list.size());

            System.out.println("������� �� ������� 1: " + list.get(1));



            list.remove(1);



            System.out.println("������ ������ ����� ��������: " + list.size());

            System.out.println("������� �� ������� 1 ����� ��������: " + list.get(1));

        }

    }

