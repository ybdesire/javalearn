import java.lang.StringBuilder;

class StrOp
{
	
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("");
		System.out.println(sb.capacity());
		
		sb.append("asdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		sb.append("asdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwertasdffqwert");
		System.out.println(sb.length() + ", " + sb.capacity());
		
	}
}