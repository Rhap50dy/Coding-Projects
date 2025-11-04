#include <SomeLibrary.h> 

int main() {
    while (.IsButtonPressed == true) {
        .setcolor random((255, 0, 0), (255, 90, 0), (255, 232, 8), (170, 66, 3));
        .setbrightness (random(100, 255));
        delay (50);
    } else {
        .setcolor (0, 0, 0);
        .setbrightness (0);
    }
}