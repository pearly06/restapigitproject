package InputOutPut;

import java.io.File;
import java.text.SimpleDateFormat;

public class lastModifiedFileDate {

	public static void main(String[] args) {
		File file = new File ("D:\\programs\\testData\\newfile.txt");
        System.out.println(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY  HH:mm:ss");
        System.out.println("Last Modified Date : "+sdf.format(file.lastModified()));
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMM/dd/YY  HH:mm a z");
        System.out.println("Last Modified Date : "+sdf1.format(file.lastModified()));
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMM/dd/YY  hh:mm a z E F W w G S");
        // G = era desifnator eg : AD // E = day in a week // F = day of week in month //W = week in a month //w=week in a year //S = time in millisecond
        System.out.println("Last Modified Date : "+sdf2.format(file.lastModified()));
	}

}
/*
 * G	Era designator	Text	AD
y	Year	Year	1996; 96
M	Month in year	Month	July; Jul; 07
w	Week in year	Number	27
W	Week in month	Number	2
D	Day in year	Number	189
d	Day in month	Number	10
F	Day of week in month	Number	2
E	Day in week	Text	Tuesday; Tue
a	Am/pm marker	Text	PM
H	Hour in day (0-23)	Number	0
k	Hour in day (1-24)	Number	24
K	Hour in am/pm (0-11)	Number	0
h	Hour in am/pm (1-12)	Number	12
m	Minute in hour	Number	30
s	Second in minute	Number	55
S	Millisecond	Number	978
z	Time zone	General time zone	Pacific Standard Time; PST; GMT-08:00
Z	Time zone	RFC 822 time zone	*/
