//Q-06

class MyClass {
public:
    int publicVar;  //accessible everywhere
private:
    int privateVar; // accessible only inside MyClass
protected:
    int protectedVar; // accessible in MyClass and derived classes
};

int main() {
    MyClass obj;
    obj.publicVar = 5;
    return 0;
}