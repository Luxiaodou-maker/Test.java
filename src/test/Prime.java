package test;

    public class Prime {
        public static void main(String[] args) {
            int[] primes=new int[50];//输出前50个素数
            primes[0]=2;
            int cnt=1;//计数器
            MAIN_LOOP://用来标志for循环，以便continue可以跳出最外层循环
            for(int x=3;cnt<50;x++)
            {
                for(int i=0;i<cnt;i++)
                {
                    if(x%primes[i]==0)
                    {
                        continue MAIN_LOOP;
                    }
                }
                primes[cnt++]=x;//这个数如果通过循环，就把它储存到数组中
            }
            System.out.println("前50个素数为：");
            for(int k:primes)
            {
                System.out.println(k+" ");
            }
        }
    }


