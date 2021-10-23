package com.example.demo.model;

public class Math {
public int somme(int a,int b)
{
return a+b;	
}
public int produit(int a, int b)
{
return a*b;	

}
public double factoriel(int a)
{
double  f=1;
for(int i=2;i<=a;i++)
{
f*=i;	
}
return f;

}
	
}
