---
marp: true
---

# **1. Markdown이란**


---
## Markdown 
- Markup Language의 일종
- 마우스를 사용하지 않고도 text 서식을 가능하게 하는 문서 편집 문법
- 작성된 문서가 쉽게 HTML등 다른 문서 형태로 변환 가능 
    > 문서 작성 시간 단축 
- 확장자 : _.md file_  

### Marp for VS Code

- Support file types
    > HTML, PDF, PPTX, PNG, JPEG

---
### **Pros**
1. 간결하다.
2. 별도의 도구 없이 작성 가능하다.
3. Text로 저장되어 용량이 작다. ( 보관에 용이 )
4. 지원하는 플랫폼이 다양하다.

### **Cons**
1. 표준이 없다.
2. 모든 HTML Markup을 대신하지 못한다.

---
## Markdown 문법 

- 글자 크기 ( # 1개~6개 )
- 숫자 리스트 (1. 2. 3. )
- 점 리스트 ( - - - )
- 줄 바꿈 (---)
- 굵은 글씨 ( ** hello ** ) or ( __ world __ ) 
- 기울인 글씨 ( * world * ) or ( _ world _ )

---
## Markdown 문법 
- Block (' > ')
    > ###### First Block
    >>  *Second Block*
- Link : http://google.com
- code : TAB 두번

        this is code block.

    


---
# 2. **Markup Language**

---
###### *Markup : 독서를 할 때 중요한 단어나 문구에 어떤 표시를 함으로 의미를 내포하도록 하는 것.* 

## Markup Language 
- "마크(Mark)"로 둘러싸인 언어 ( "태그" 로 둘러싸였다고도 표현 )
- 의미를 가진 TAG를 이용하여 Text에 의미를 가지도록 하는 언어
- 문서의 골격에 해당하는 부분을 작성하는데 사용

> ###### 절차적 Markup 언어 : 문서의 형식, 텍스트의 외양 기술 ex) 워드 프로세서
> ###### 기술적 Markup 언어 : 문서의 논리 구조 및 속성 기술 ex) HTML, XML

### Markup vs Markdown
      markdown:  일반 텍스트 문서의 양식을 편집하는 문법
      markup language : 태그 등을 이용하여 문서나 데이터의 구조를 명기하는 언어의 한 가지이다.

---

###  1. HTML5 ( HyperText Markup Language )
     HyperText : 문서와 문서가 링크로 연결되어 있다.
     Makrup : Tag로 이루어져 있다.

- ###### web page를 만들기 위한 언어로써 Web browser 위에서 동작하는 언어이다.
- ###### HTML 코드를 파일에 저장하고 웹브라우저에서 로딩하면 웹페이지가 만들어진다.
- ###### 확장자명 : html || htm 

---
~~~
<!doctype html>
<html lang = "en">
    <head>
    <title> Hyoung Joon Hyuck </title>
    </head>
    <body> 
        <h1> This is Spring study! </h1>
        <li> a </li>
        <li> b </li>
        <li> c </li>
    </body>
</html>
~~~


---

###  2. XML ( eXtensible Markup Language )

- ###### 확장성 있는 Markup 언어를 정의하기 위한 언어
- ###### 데이터 저장과 전송을 목적으로 만들어진 Markup 언어
- ###### 인간과 응용 프로그램 사이 혹은 응용 프로그램간의 정보를 쉽게 교환할 수 있다.
- ###### 정보를 tag로 표시할 수 있고 사용자 마음대로 tag를 정의할 수 있다.

|  | TAG | 문서 | 특징 | 출력 형식 |
|:--------:|:--------:|:--------:|:--------:|:--------:|
| HTML | 시용자 정의 X | 재사용 X | 단순한 문서의 presentation | CSS |
| XML | 사용자 정의 O | 재사용 O | Wab에서의 정보 교환 | XML |

---

> 문법 : <요소이름 속성1="속성값" 속성2="속성값" ... >

~~~
<student>

    <name>형준혁</name>

    <year>3</year>

    <major>소프트웨어학과</major>

</student>
~~~
