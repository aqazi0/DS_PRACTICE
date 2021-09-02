#include<bits/stdc++.h>

using namespace std;
//template
template<class T>
int search(T a[],int n,T key){
    for(int i=0;i<n;i++){
        if(a[i]==key){
            return i;
        }
    }
    return n;
}


//template+iterator+comparitor
template<class forwarditerator, class T>
forwarditerator search(forwarditerator begin, forwarditerator end, T key){
    while(begin!=end){
        if(*begin==key){
            return begin;
        }
        begin++;
    }
    return end;
}


//template+iterator+comparitor
template<class forwarditerator, class T, class Compare>
forwarditerator search(forwarditerator begin, forwarditerator end, T key,Compare cmp){
    while(begin!=end){
        if(cmp(*begin,key)){
            return begin;
        }
        begin++;
    }
    return end;
}


class Book{
    public:
    string name;
    int price;

    Book(){
        
    }

    Book(string name,int price){
        this->name=name;
        this->price=price;
    }
};


class Bookcompare{
    public:
    bool operator()(Book A,Book B){
        if(A.name==B.name)
        return true;
        return false;
    }
};


int main(){
    // int a[]={1,2,3,4,5};
    // cout<<search(a,5,4);
    vector<Book> l;
    Book b1("Harry Potter",1000);
    Book b2("Jungle Book",150);
    Book b3("Fault in our stars",500);
    l.push_back(b1);
    l.push_back(b2);
    l.push_back(b3);

    Bookcompare cmp;

    Book bsearch("Harry Potter",1200);
    auto it=search(l.begin(),l.end(),bsearch,cmp);
    if(it!=l.end())
    cout<<"Found";
    else
    cout<<"Not Found";
    return 0;
}