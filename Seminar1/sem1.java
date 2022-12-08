/*
Р’ РєРѕРЅСЃРѕР»Рё Р·Р°РїСЂРѕСЃРёС‚СЊ РёРјСЏ РїРѕР»СЊР·РѕРІР°С‚РµР»СЏ. Р’ Р·Р°РІРёСЃРёРјРѕСЃС‚Рё РѕС‚ С‚РµРєСѓС‰РµРіРѕ РІСЂРµРјРµРЅРё, РІС‹РІРµСЃС‚Рё РїСЂРёРІРµС‚СЃС‚РІРёРµ РІРёРґР°
"Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 05:00 РґРѕ 11:59
"Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 12:00 РґРѕ 17:59;
"Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 18:00 РґРѕ 22:59;
"Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, <РРјСЏ>!", РµСЃР»Рё РІСЂРµРјСЏ РѕС‚ 23:00 РґРѕ 4:59

 */
/*
Р”Р°РЅ РјР°СЃСЃРёРІ РґРІРѕРёС‡РЅС‹С… С‡РёСЃРµР», РЅР°РїСЂРёРјРµСЂ [1,1,0,1,1,1],
РІС‹РІРµСЃС‚Рё РјР°РєСЃРёРјР°Р»СЊРЅРѕРµ РєРѕР»РёС‡РµСЃС‚РІРѕ РїРѕРґСЂСЏРґ РёРґСѓС‰РёС… 1.
 */
/*
Р’Рѕ С„СЂР°Р·Рµ "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java" РїРµСЂРµСЃС‚Р°РІРёС‚СЊ СЃР»РѕРІР° РІ РѕР±СЂР°С‚РЅРѕРј РїРѕСЂСЏРґРєРµ.

 */
/*
Р РµР°Р»РёР·РѕРІР°С‚СЊ С„СѓРЅРєС†РёСЋ РІРѕР·РІРµРґРµРЅРёСЏ С‡РёСЃР»Р° Р° РІ СЃС‚РµРїРµРЅСЊ b. a, b РёР· Z.
РЎРІРѕРґСЏ РєРѕР»РёС‡РµСЃС‚РІРѕ РІС‹РїРѕР»РЅСЏРµРјС‹С… РґРµР№СЃС‚РІРёР№ Рє РјРёРЅРёРјСѓРјСѓ.
РџСЂРёРјРµСЂ 1: Р° = 3, b = 2, РѕС‚РІРµС‚: 9
РџСЂРёРјРµСЂ 2: Р° = 2, b = -2, РѕС‚РІРµС‚: 0.25
РџСЂРёРјРµСЂ 3: Р° = 3, b = 0, РѕС‚РІРµС‚: 1

 */
/*
Р”Р°РЅ РјР°СЃСЃРёРІ nums = [3,2,5,3] Рё С‡РёСЃР»Рѕ val = 3.
Р•СЃР»Рё РІ РјР°СЃСЃРёРІРµ РµСЃС‚СЊ С‡РёСЃР»Р°, СЂР°РІРЅС‹Рµ Р·Р°РґР°РЅРЅРѕРјСѓ, РЅСѓР¶РЅРѕ РїРµСЂРµРЅРµСЃС‚Рё СЌС‚Рё СЌР»РµРјРµРЅС‚С‹ РІ РєРѕРЅРµС† РјР°СЃСЃРёРІР°.
РўР°РєРёРј РѕР±СЂР°Р·РѕРј, РїРµСЂРІС‹Рµ РЅРµСЃРєРѕР»СЊРєРѕ (РёР»Рё РІСЃРµ) СЌР»РµРјРµРЅС‚РѕРІ РјР°СЃСЃРёРІР° РґРѕР»Р¶РЅС‹ Р±С‹С‚СЊ РѕС‚Р»РёС‡РЅС‹ РѕС‚ Р·Р°РґР°РЅРЅРѕРіРѕ,
Р° РѕСЃС‚Р°Р»СЊРЅС‹Рµ - СЂР°РІРЅС‹ РµРјСѓ.
[2,5,3,3]
 */


 import java.time.LocalTime;
 import java.util.Arrays;
 import java.util.Scanner;
 
 public class sem1 {
 
     public static void main(String[] args) {
 //        ex1();
         
 //        int[] array = new int[]{1,1,0,1,1,1};
 //        int count = ex2(array);
 //        System.out.println(count);
 
 //        String s = "Р”РѕР±СЂРѕ РїРѕР¶Р°Р»РѕРІР°С‚СЊ РЅР° РєСѓСЂСЃ РїРѕ Java";
 //        System.out.println(ex3(s));
 
 //        System.out.println(ex4(5, 0));
 
         int[] arr = new int[]{3,2,5,3, 3, 5, 10, 1, 3};
         int val = 3;
         int[] res = ex5(arr, val);
         System.out.println(Arrays.toString(res));
     }
 
     public static void ex1(){
         System.out.println("РљР°Рє С‚РµР±СЏ Р·РѕРІСѓС‚?");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
 
         LocalTime time = LocalTime.now();
         int hour = time.getHour();
 
         String res = "";
         if (hour >= 5 && hour < 12){
             res += "Р”РѕР±СЂРѕРµ СѓС‚СЂРѕ, ";
         } else if (hour >= 12 && hour < 18){
             res += "Р”РѕР±СЂС‹Р№ РґРµРЅСЊ, ";
         } else if (hour >= 18 && hour < 23) {
             res += "Р”РѕР±СЂС‹Р№ РІРµС‡РµСЂ, ";
         } else {
             res += "Р”РѕР±СЂРѕР№ РЅРѕС‡Рё, ";
         }
 
         System.out.println(res + name);
     }
     public static int ex2(int[] arr){
         int maxCount = 0;
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == 1){
                 count++;
             } else {
                 if (maxCount < count){
                     maxCount = count;
                 }
                 count = 0;
             }
         }
         if (maxCount < count){
             maxCount = count;
         }
         return maxCount;
     }
     public static String ex3(String s){
         String[] arr = s.split(" ");
         String res = "";
         for (int i = arr.length-1; i >= 0 ; i--) {
             res += arr[i] + " ";
         }
         return res;
     }
     public static double ex4(int a, int b){
         if (b == 0) {
             return 1;
         }
         if (a == 0 || a == 1){
             return a;
         }
         double a1 = a;
         if (b < 0){
             b = -b;
             a1 = 1 / a1;
         }
 
         double res = 1;
         for (int i = 0; i < b; i++) {
             res *= a1;
         }
         return res;
     }
     public static int[] ex5(int[] arr, int val){
         int[] res = new int[arr.length];
         Arrays.fill(res, val);
         for (int i = 0, j = 0; i < arr.length; i++) {
             if (arr[i] != val){
                 res[j] = arr[i];
                 j++;
             }
         }
         return res;
     }
 }