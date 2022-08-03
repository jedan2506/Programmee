#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

int ir=7;
#define OLED_RESET     4 // Reset pin # (or -1 if sharing Arduino reset pin)
Adafruit_SSD1306 display(OLED_RESET);
 void setup()
 {
 Wire.begin();
 display.begin(SSD1306_SWITCHCAPVCC,0x3C);
 pinMode(ir,INPUT);
 }

 void loop()
 {
  int l=digitalRead(ir);
  display.clearDisplay();
  display.setCursor(0,0);
  display.setTextSize(1);
  display.setTextColor(WHITE);
  if(l==1)
  display.print("NOOOO");
  else
  display.print("Yess");
  display.display();//for updating
  delay(500);
 }
