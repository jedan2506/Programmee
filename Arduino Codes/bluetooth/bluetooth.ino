#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#include <SoftwareSerial.h>
String value="";
int TX=7;
int RX=6;
int LED=8;

SoftwareSerial blue(TX,RX);

#define OLED_RESET     4 // Reset pin # (or -1 if sharing Arduino reset pin)
Adafruit_SSD1306 display(OLED_RESET);
 void setup()
 {
 Wire.begin();
 display.begin(SSD1306_SWITCHCAPVCC,0x3C);
 blue.begin(9600);
 Serial.begin(9600);
 pinMode(LED,OUTPUT);
 }

 void loop()
 {
  display.clearDisplay();
  display.setCursor(40 ,10);
  display.setTextSize(1);
  display.setTextColor(WHITE);
  if(blue.available()>0)
  {
    value=blue.readString();
    display.print(value);
    Serial.print(value);
    delay(500);
    if(value.equalsIgnoreCase("turn on"))
    {
      digitalWrite(LED,HIGH);
      Serial.println("Done");
    } 
    else if(value.equalsIgnoreCase("turn off"))
    digitalWrite(LED,LOW);
  }
  display.display();//for updating
  delay(500);
 }

