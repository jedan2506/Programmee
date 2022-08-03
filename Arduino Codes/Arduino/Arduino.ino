#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

// Declaration for an SSD1306 display connected to I2C (SDA, SCL pins)
#define OLED_RESET     4 // Reset pin # (or -1 if sharing Arduino reset pin)
Adafruit_SSD1306 display(OLED_RESET);
 void setup()
 {
 Wire.begin();
 display.begin(SSD1306_SWITCHCAPVCC,0x3C);
 display.clearDisplay();
 }

 void loop()
 {
  display.clearDisplay();
  display.setCursor(0,0);
  display.setTextSize(1);
  display.setTextColor(WHITE);
  display.print("HELLO");
  display.display();//for updating
  delay(500);
 }

