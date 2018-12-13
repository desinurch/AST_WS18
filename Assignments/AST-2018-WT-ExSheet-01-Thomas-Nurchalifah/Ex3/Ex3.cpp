// Program needs to be compiled by C++ 11th version, use -std=c++11 to compile

#include<iostream>
#include<math.h>
#include<stdio.h>
#include<iomanip>
#include<string>
#include<climits>
#include<cmath>

using namespace std;

int* func_1();
float* func_2();
string * func_3();
int* func_4();
string * func_5();
string * func_6();
void print_table(int [] ,float [] ,string [] ,int [] ,string [] ,string []);


int* func_1()
{
  //f (n) = 2n
  static int arr[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    arr[i] = 2*i;
  }
  return arr;
}

float* func_2()
{
  //f (n) = sqrt(n)
  static float arr[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    arr[i] = sqrt(i);
  }
  return arr;
}

string* func_3()
{
  //f (n) = 10^n
  static long long int temp = 0;
  static string arr_str[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    temp = pow(10,i);
    if (abs(temp+1) >= LLONG_MAX)
    {
      arr_str[i] = "10^"+to_string(i);
    }
    else
    {
      arr_str[i] = to_string(temp);
    }
  }
  return arr_str;
}

int* func_4()
{
  //f (n) = n^3
  static int arr[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    arr[i] = pow(i,3);
  }
  return arr;
}

string * func_5()
{
  //f (n) = 2^(1/n)
  static string arr[101] = {};
  arr[0] = "Inf";
  for (int i = 1 ;i <=100; i++)
  {
    arr[i] = to_string(pow(2, 1/i));
  }
  return arr;
}

string * func_6()
{
  //f (n) = e^(n)
  static long long int temp = 0;
  static string arr_str[101] = {};
  for (int i = 0 ;i <=100; i++)
  {
    temp = exp(i);
    if (abs(temp+1) >= LLONG_MAX)
    {
      arr_str[i] = "e^("+to_string(i)+")";
    }
    else
    {
      arr_str[i] = to_string(temp);
    }
  }
  return arr_str;
}

void print_table(int arr_1[],float arr_2[],string arr_3[],int arr_4[],string arr_5[],string arr_6[])
{
  // printing the table
  cout << endl;
  for (int i = 0; i < 183; i++) {cout << "=";}
  cout << endl;
  printf("|%25s|%25s|%25s|%25s|%25s|%25s|%25s|\n", "Number", "2*n", "sqrt(n)", "10^(n)", "n^(3)", "2^(1/n)", "e^(n)");
  for (int i = 0; i < 183; i++) {cout << "=";}
  cout << endl;
  for (int i = 0; i < 101 ; i ++)
  {
    cout << setw(25) <<i << setw(25) << arr_1[i] << setw(28) << arr_2[i] << setw(27) << arr_3[i] << setw(25) << arr_4[i] << setw(25) << arr_5[i] << setw(25) << arr_6[i]<<"\n";
  }
  
}

int main()
{
  int * arr_1 = func_1();
  float * arr_2 = func_2();
  string * arr_3 = func_3();
  int * arr_4 = func_4();
  string * arr_5 = func_5();
  string * arr_6 = func_6();
  print_table(arr_1,arr_2,arr_3,arr_4,arr_5,arr_6);
  return 0;
}
