## Springboot + Keycloak 적용
### 개요
* 일바적인 Application 의 공통 기능인 인증/인가에 대하여 
* 별도 구축을 할 수 있지만 Keycloak을 적용함으로 대부분의 기능을 쉽게 사용할 수 있다.

### 인증/인가의 공통 기능
1. 로그인
2. 회원가입
3. 이메일 인증
4. 비밀번호 찾기(변경)
5. 2차 인증 (OTP)
6. SSO(Single Sign On)
7. 쇼셜 로그인(OIDC)
8. 권한(역할) 및 그룹 관리 등등

### Keycloak 
> Keycloak은 현대의 애플리케이션과 서비스에 초점을 둔 
> IAM(Identity and Access Management)에 통합 인증(SSO)을 허용하는 
> 오픈 소스 소프트웨어 제품이다. <BR>
> 2018년 3월 기준으로 와일드플라이 커뮤니티 프로젝트는 RH-SSO 프로젝트의 업스트림 프로젝트로서 
> 사용하는 레드햇의 관리 하에 있다.