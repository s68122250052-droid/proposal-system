1) Department
หน้าที่:
เก็บข้อมูลหน่วยงาน/แผนกที่ผู้ใช้สังกัดในระบบ

Attributes

department_id : int → รหัสแผนก (Primary Key)

department_name : String → ชื่อแผนก

Methods

insertDepartment() → เพิ่มข้อมูลแผนกใหม่เข้าสู่ระบบ

updateDepartment() → แก้ไขข้อมูลแผนก

deleteDepartment() → ลบข้อมูลแผนกออกจากระบบ
2) Login
หน้าที่:
เก็บข้อมูลพื้นฐานสำหรับการเข้าสู่ระบบ และตรวจสอบสถานะการล็อกอิน

Attributes

username : String → ชื่อผู้ใช้สำหรับเข้าสู่ระบบ

password : String → รหัสผ่านของผู้ใช้

Methods

loginStatus() → ตรวจสอบความถูกต้องของชื่อผู้ใช้และรหัสผ่าน และคืนค่าสถานะการเข้าสู่ระบบ (สำเร็จ/ไม่สำเร็จ)
3) User
หน้าที่:
แทนผู้ใช้งานระบบ เช่น เจ้าหน้าที่ ประชาสัมพันธ์ หรือผู้จัดการ
สามารถจัดการ Proposal และ Report ได้ตามบทบาท (Role)

Attributes

user_id : int → รหัสผู้ใช้ (Primary Key)

department_id : int → รหัสแผนกที่ผู้ใช้สังกัด

user_username : String → ชื่อบัญชีผู้ใช้

user_password : String → รหัสผ่าน

user_name : String → ชื่อ–นามสกุลผู้ใช้

user_gender : Gender → เพศของผู้ใช้ (อ้างอิง enum Gender)

user_email : String → อีเมลของผู้ใช้

user_role : RoleUser → บทบาทของผู้ใช้ (อ้างอิง enum RoleUser)

Methods

userLogin() → กระบวนการเข้าสู่ระบบของผู้ใช้

addProposal() → สร้างหรือเพิ่มข้อมูล Proposal

viewProposal() → ดูรายการ Proposal

confirmProposal() → พิจารณา อนุมัติ หรือปฏิเสธ Proposal

createReports() → สร้างรายงาน (Report)

viewReports() → ดูรายงาน

updateDepartment() → แก้ไขข้อมูลแผนก (ทำได้เฉพาะบางบทบาท)
4) Proposal
หน้าที่:
เก็บข้อมูลข้อเสนอหรือคำขอที่ผู้ใช้ยื่นเข้ามาในระบบ พร้อมสถานะการพิจารณา

Attributes

proposal_code : String → รหัสข้อเสนอ

proposal_title : String → ชื่อเรื่องข้อเสนอ

proposal_text : String → รายละเอียดข้อเสนอ

proposal_date : Date → วันที่ยื่นข้อเสนอ

proposal_status : StatusProposal → สถานะของข้อเสนอ (ค่าเริ่มต้น Waiting)

Methods

viewProposal() → ดูรายละเอียด Proposal

viewStatus() → ดูสถานะปัจจุบันของ Proposal

updateProposal() → แก้ไขข้อมูล Proposal

deleteProposal() → ลบ Proposal

archiveProposal() → จัดเก็บ Proposal เข้าคลัง

viewApplicant() → ดูข้อมูล Applicant ที่ผูกกับ Proposal
5) Report
หน้าที่:
จัดเก็บข้อมูลรายงานที่ถูกสร้างจาก Proposal เพื่อสรุปหรือแสดงผลข้อมูล

Attributes

report_code : int → รหัสรายงาน

report_date : Date → วันที่ออกรายงาน

Methods

viewReports() → ดูรายงาน

createReports() → สร้างรายงานใหม่
6) Applicant

หน้าที่:
เก็บข้อมูลผู้สมัครหรือผู้ยื่นคำขอ ซึ่งจะถูกผูกอยู่กับ Proposal

Attributes

applicant_id : int → รหัสผู้สมัคร

applicant_name : String → ชื่อผู้สมัคร

applicant_job : String → อาชีพหรือตำแหน่ง

applicant_address : String → ที่อยู่ผู้สมัคร

applicant_gender : Gender → เพศของผู้สมัคร (enum Gender)

applicant_tel : char → เบอร์โทรศัพท์ของผู้สมัคร

Methods

insertApplicant() → เพิ่มข้อมูลผู้สมัคร

updateApplicant() → แก้ไขข้อมูลผู้สมัคร

deleteApplicant() → ลบข้อมูลผู้สมัคร
Enum
RoleUser

หน้าที่: กำหนดบทบาทของผู้ใช้ในระบบ

PublicRelation → ประชาสัมพันธ์

Division → ฝ่ายงาน

Manager → ผู้จัดการ

Gender

หน้าที่: กำหนดเพศของผู้ใช้หรือผู้สมัคร

Male : String = M → เพศชาย

Female : String = F → เพศหญิง

StatusProposal

หน้าที่: กำหนดสถานะของ Proposal

Waiting : String = Waiting → รอการพิจารณา

Accepted : String = Accepted → อนุมัติ

Rejected : String = Rejected → ปฏิเสธ

Methods

changeStatus() → เปลี่ยนสถานะของ Proposal
ความสัมพันธ์ระหว่างคลาส (Relationship + Cardinality)
1 ความสัมพันธ์ระหว่าง User — Department

ประเภทความสัมพันธ์: Association

Cardinality:

Department 1 แผนก สามารถมี User ได้ตั้งแต่ 1 คนขึ้นไป (1..*)

User 1 คน สามารถสังกัด Department ได้ 0 หรือ 1 แผนก (0..1)

ความหมายเชิงระบบ:
แผนกหนึ่งสามารถมีผู้ใช้งานหลายคนได้ แต่ผู้ใช้หนึ่งคนจะสังกัดได้เพียงแผนกเดียว หรืออาจยังไม่ได้กำหนดแผนกก็ได้ในบางกรณี

2 ความสัมพันธ์ระหว่าง User — Login

ประเภทความสัมพันธ์: Inheritance

ความหมาย:
User เป็นคลาสย่อยที่สืบทอดมาจาก Login หมายความว่าผู้ใช้งานทุกคนจะมีข้อมูลพื้นฐานสำหรับการเข้าสู่ระบบ เช่น username และ password และสามารถใช้งานฟังก์ชันการล็อกอินได้

3 ความสัมพันธ์ระหว่าง User — Proposal

ประเภทความสัมพันธ์: Association

Cardinality:

User 1 คน สามารถสร้างหรือดูแล Proposal ได้ตั้งแต่ 1 รายการขึ้นไป (1..*)

Proposal 1 รายการ จะมี User เป็นผู้สร้างหรือผู้รับผิดชอบเพียง 1 คน

ความหมายเชิงระบบ:
ผู้ใช้สามารถสร้างข้อเสนอได้หลายรายการ แต่ข้อเสนอแต่ละรายการจะมีผู้รับผิดชอบเพียงคนเดียว

4 ความสัมพันธ์ระหว่าง User — Report

ประเภทความสัมพันธ์: Association

Cardinality:

User 1 คน สามารถสร้าง Report ได้ 0 หรือหลายรายการ (0..*)

Report 1 รายการ จะถูกสร้างโดย User เพียง 1 คน

ความหมายเชิงระบบ:
ผู้ใช้งานอาจยังไม่เคยสร้างรายงานเลย หรือสามารถสร้างรายงานได้หลายฉบับ โดยรายงานแต่ละฉบับจะมีผู้สร้างชัดเจน

5 ความสัมพันธ์ระหว่าง Report — Proposal

ประเภทความสัมพันธ์: Composition

Cardinality:

Report 1 รายการ จะผูกกับ Proposal 1 รายการ (1 : 1)

ความหมายเชิงระบบ:
รายงานถูกสร้างขึ้นจากข้อมูลของ Proposal หาก Proposal ถูกลบ รายงานที่เกี่ยวข้องก็จะไม่สามารถใช้งานได้

6 ความสัมพันธ์ระหว่าง Proposal — Applicant

ประเภทความสัมพันธ์: Composition

Cardinality:

Proposal 1 รายการ จะมี Applicant 1 คน (1 : 1)

ความหมายเชิงระบบ:
ข้อมูลผู้สมัครจะต้องผูกอยู่กับ Proposal เสมอ หากลบ Proposal ข้อมูล Applicant ที่เกี่ยวข้องก็จะถูกลบไปด้วย

7 การใช้ Enum ในระบบ

User.user_gender และ Applicant.applicant_gender ใช้ enum Gender เพื่อกำหนดเพศ

User.user_role ใช้ enum RoleUser เพื่อกำหนดบทบาทของผู้ใช้

Proposal.proposal_status ใช้ enum StatusProposal เพื่อกำหนดสถานะของ Proposal
