package gg.git.tests;

public class GitTest {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1==s2);
		System.out.println(s1.substring(1)==s2.substring(1));
		System.out.println(s1.substring(1).intern()==s2.substring(1).intern());
	}
}
