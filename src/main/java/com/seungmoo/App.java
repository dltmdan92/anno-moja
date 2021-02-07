package com.seungmoo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 먼저 mvn build (mvn clean compile) 해준 다음에
        // magic-moja 의 Annotation Processor가 @Magic 에 맞춰서 MagicMoja class를 생성해줄 것임 (target에)
        // 그리고 아래 주석 풀어서 실행 ㄱㄱ 해보자.

        // module셋팅에서 generated-sources 를 source로 인식 시켜주도록 한다.

        Moja moja = new MagicMoja();
        System.out.println(moja.pullOut());
    }
}
