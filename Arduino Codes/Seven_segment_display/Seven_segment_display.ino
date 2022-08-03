int a=7;
int b=6;
int c=5;
int d=4;
int e=3;
int f=2;
int g=1;
int dot=8;

void setup() 
{
  pinMode(a,OUTPUT);
  pinMode(b,OUTPUT);
  pinMode(c,OUTPUT);
  pinMode(d,OUTPUT);
  pinMode(e,OUTPUT);
  pinMode(f,OUTPUT);
  pinMode(g,OUTPUT);
  pinMode(dot,OUTPUT);

}

void loop()
{
  for(int i=0;i<10;i++)
  {             
        delay(1000); 
        digitalWrite(b,LOW);
        digitalWrite(a,LOW);
        digitalWrite(d,LOW);
        digitalWrite(e,LOW);
        digitalWrite(f,LOW);
        digitalWrite(g,LOW);
        digitalWrite(c,LOW);

    switch(i)
    {
      case 1:digitalWrite(b,HIGH);
      digitalWrite(c,HIGH);
      break;
      
      case 2: digitalWrite(b,HIGH);
      digitalWrite(a,HIGH);
      digitalWrite(g,HIGH);
      digitalWrite(e,HIGH);
      digitalWrite(d,HIGH);
      break;
      
      case 3: digitalWrite(b,HIGH);
      digitalWrite(a,HIGH);
      digitalWrite(g,HIGH);
      digitalWrite(c,HIGH);
      digitalWrite(d,HIGH);
      break;
      
      case 4: digitalWrite(f,HIGH);
      digitalWrite(g,HIGH);
      digitalWrite(b,HIGH);
      digitalWrite(c,HIGH);
      break;
      
      case 5: digitalWrite(a,HIGH);
      digitalWrite(f,HIGH);
      digitalWrite(g,HIGH);
      digitalWrite(c,HIGH);
      digitalWrite(d,HIGH);
      break;
      
      case 6: digitalWrite(a,HIGH);
      digitalWrite(f,HIGH);
      digitalWrite(g,HIGH);
      digitalWrite(e,HIGH);
      digitalWrite(c,HIGH);
      digitalWrite(d,HIGH);
      break;
      
      case 7: digitalWrite(a,HIGH);
      digitalWrite(b,HIGH);
      digitalWrite(c,HIGH);
      break;
      
      case 8: 
        digitalWrite(b,HIGH);
        digitalWrite(a,HIGH);
        digitalWrite(d,HIGH);
        digitalWrite(e,HIGH);
        digitalWrite(f,HIGH);
        digitalWrite(g,HIGH);
        digitalWrite(c,HIGH);  
        break;
        
     case 9: digitalWrite(a,HIGH);
     digitalWrite(b,HIGH);
     digitalWrite(c,HIGH);
     digitalWrite(f,HIGH);
     digitalWrite(g,HIGH);
     digitalWrite(d,HIGH);
     break;

     default: digitalWrite(a,HIGH);
     digitalWrite(b,HIGH);
     digitalWrite(c,HIGH);
     digitalWrite(d,HIGH);
     digitalWrite(e,HIGH);
     digitalWrite(f,HIGH);
    }
  }
}

