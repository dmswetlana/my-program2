//���������� ������������ ��� ������������� ����������
// ���������� �������-�������������

		class Box{
			double width;
			double heigth;
			double depth;
		
			//� �������� ��������� ������������ ������ ���� Box
			Box(Box ob){
			width = ob.width;
			heigth = ob.heigth;
			depth = ob.depth;
			}
			
	//����������� ������ Box � ��������� ���� ��������
			Box(double w, double h, double d){
				System.out.println("��������������� ������� Box");
				width = w;
				heigth = h;
				depth = d;
			}
			
	//�����������, ����� �� ���� �� �������� �� ������
			Box(){
				width = -1;  //������������ �������� -1 ���
				heigth = -1; //����������� ���������������������
				depth = -1;  //���������������
				
			}
	
	//�����������, ������������ ��� �������� ����
				Box (double len){
					width = heigth = depth = len;
				}		
			
			
	//���������� ����� ���������������
			
			double volume() {
				return (width*heigth*depth);
			}			
		}

public class BoxDemo3 {
			public static void main(String[] args) {
				Box mybox1 = new Box(10, 20, 15);
				Box mybox2 = new Box( );
				Box mybox3 = new Box(7);
				Box myclone = new Box(mybox1);
				
				double vol;
				
				vol = mybox1.volume();
				System.out.println("����� mybox1 = " + vol);

				vol = mybox2.volume();				
				System.out.println("�����  mybox2 = " + vol);
				
				vol = mybox3.volume();				
				System.out.println("�����  mybox3 = " + vol);
			
				vol = myclone.volume();
				System.out.println("����� ����� = " + vol);
			}

		}
	
		
		
	