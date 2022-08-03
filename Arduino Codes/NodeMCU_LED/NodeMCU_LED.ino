
#define BLYNK_PRINT Serial


#include <ESP8266WiFi.h> 
#include <BlynkSimpleEsp8266.h>

char auth[] = "2b9aad3e9b45471e9cca93b6bc8b11f6";
char ssid[] = "Parth";
char pass[] = "mohr4459";

void setup()
{
  
  Serial.begin(9600);

  Blynk.begin(auth, ssid, pass);
  // You can also specify server:
  //Blynk.begin(auth, ssid, pass, "blynk-cloud.com", 80);
  //Blynk.begin(auth, ssid, pass, IPAddress(192,168,1,100), 8080); ..
}

void loop()
{
  Blynk.run();
}

