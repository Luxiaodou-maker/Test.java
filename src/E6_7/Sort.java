package E6_7;

public class Sort {
    public void sort(char a[]){
        for (int i = 0; i <a.length-1; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]>a[j]){
                  char temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
}
