#include<stdio.h>
int sum();
void main()
{
    printf("Going to calculaate the area of the square \n");
    float area = square();
    printf("The area of the square %f \n",area);
}
int square()
{
    float side;
    printf(" enter the length of the side in meters");
    scanf("%f",&side);
    return side*side;
}
