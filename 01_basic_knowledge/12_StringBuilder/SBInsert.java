public class SBInsert {
    public static void main(String[] args) {
		// ����һ���յ�StringBuilder����
		StringBuilder str = new StringBuilder();
        
		// ׷���ַ���
		str.append("jaewkjldfxmopzdm");
		
        // �Ӻ���ǰÿ����λ���붺��
		
        for(int i=str.length()-1;i>=0;i-=3)
        {
            if(i!=str.length()-1)
            {
                str.insert(i,',');
            }
        }
        
		
        // ��StringBuilder����ת��ΪString�������
		System.out.print(str.toString());
	}
}