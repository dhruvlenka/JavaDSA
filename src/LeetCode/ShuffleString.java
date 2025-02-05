//LeetCode: 1528
public class ShuffleString {
    public static void main(String[] args) {
     String s = "codeleet";

     int[] indices = {4,5,6,7,0,2,1,3};
     int len = s.length(); //putting string into and integer
     char[] ch = new char[len]; // to character

    for (int i=0; i<len; i++){
          ch[indices[i]] = s.charAt(i);
    }
    //converting char to integer
        String str = String.valueOf(ch);
        System.out.println(str);

        //Way 2:this will only work for simple char not for char[] array
        char d = 'D';
        String str2 = Character.toString(d);
        System.out.println(str2);

        //Way 3: this will also only work for simple char not for char[] array
        char c = 'D';
        String str3 = "" + c;
        System.out.println(str3);
    }
}
/*
          Working:
          indices [4,5,6,7,0,2,1,3], s: "codeleet";

          ch[indices[i]]: ch[4[0]], s.chatAt(i); s.chatAt(0) = ch[4] = c;
          ch[indices[i]]: ch[5[2]], s.chatAt(i); s.charAt(1) = ch[5] = o;
          ch[indices[i]]: ch[6[3]], s.chatAt(i); s.chatAt(2) = ch[6] = d;
          ch[indices[i]]: ch[7[4]], s.chatAt(i); s.chatAt(3) = ch[7] = e;
          ch[indices[i]]: ch[0[5]], s.chatAt(i); s.chatAt(4) = ch[0] = l;
          ch[indices[i]]: ch[2[6]], s.chatAt(i); s.chatAt(5) = ch[1] = e;
          ch[indices[i]]: ch[1[7]], s.chatAt(i); s.chatAt(6) = ch[2] = e;
          ch[indices[i]]: ch[3[8]], s.chatAt(i); s.chatAt(7) = ch[3] = t;
           */