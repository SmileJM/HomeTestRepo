package baekjoon.p2.p2504;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
	static Stack<String> stack = new Stack<>();
	
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException, ScriptException {		
		String test = br.readLine();
		String str;	
		String pop = "";
		String calc = "";
		String pre = "";
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for(int i=0; i<test.length(); i++) {
			str = test.substring(i, i+1);
			if(stack.isEmpty() && (str.equals(")") || str.equals("]"))) {
				calc = "0";
				break;							
			} else if(str.equals("(")) {
				stack.push("(");
				if(pre.equals("(") || pre.equals("[")) {
					calc += "*(2"; 
				} else if(pre.equals("")){
					calc += "2";
				} else {
					calc += "+2";
				}
				pre = "(";
			} else if(str.equals("[")) {
				stack.push("[");
				if(pre.equals("(") || pre.equals("[")) {
					calc += "*(3"; 
				} else if(pre.equals("")){
					calc += "3";
				} else {
					calc += "+3";
				}
				pre = "[";
			} else if(str.equals(")")){
				pop = stack.pop();
				if(pop.equals("(")) {
					if(pre.equals(")") || pre.equals("]")) {
						calc += ")";
					}
				} else {
					calc = "0";
					break;
				}
				pre = ")";
			} else if(str.equals("]")){
				pop = stack.pop();
				if(pop.equals("[")) {
					if(pre.equals(")") || pre.equals("]")) {
						calc += ")";
					}
				} else {
					calc = "0";
					break;
				}
				pre = "]";
			}
		}		
		ScriptEngineManager  sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("JavaScript");
		
		if(stack.isEmpty() && !calc.equals("0")) {
			out.println(engine.eval(calc));
		} else {
			out.println(0);
		}
		
		out.flush();
		out.close();
	}
}