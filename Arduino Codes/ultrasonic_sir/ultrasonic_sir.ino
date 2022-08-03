const int trigPin = 7;
const int echoPin = 5;
const int LED1=8;
const int LED2=9;
const int buz=10;
// defines variables
long duration;
int distance;

void setup() {
    pinMode(trigPin, OUTPUT); // Sets the trigPin as an Output
    pinMode(echoPin, INPUT); // Sets the echoPin as an Input
    pinMode(LED1,OUTPUT);
    pinMode(LED2,OUTPUT);
    pinMode(buz,OUTPUT);
    Serial.begin(9600); // Starts the serial communication
}

void loop() {
        // Clears the trigPin
          digitalWrite(trigPin, LOW);
          delayMicroseconds(2);
          
        // Sets the trigPin on HIGH state for 10 micro seconds
          digitalWrite(trigPin, HIGH);
          delayMicroseconds(10);
          digitalWrite(trigPin, LOW);
        
        // Reads the echoPin, returns the sound wave travel time in microseconds
          duration = pulseIn(echoPin, HIGH);
        
        // Calculating the distance
          distance= duration*0.034/2;
        
        /* Prints the distance on the Serial Monitor
          Serial.print(distance);
          Serial.print("cm");
          Serial.println();
          delay(1000);*/
          if(distance>30)
          {
            digitalWrite(LED1,HIGH);
            digitalWrite(LED2,LOW);
            
          }
          else
          {
            digitalWrite(LED1,LOW);
            digitalWrite(LED2,HIGH);
            digitalWrite(buz,HIGH);
            delay(distance*40);
            digitalWrite(buz,LOW);
          }
          }

