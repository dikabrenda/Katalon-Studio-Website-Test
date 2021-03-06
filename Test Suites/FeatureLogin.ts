<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Login</description>
   <name>FeatureLogin</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>95c857cb-f75f-48d0-9529-96c1dc48395b</testSuiteGuid>
   <testCaseLink>
      <guid>a25cd138-30da-4034-9472-b4000df4c65b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login_Feature/loginWithValidCredential</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c94a0aa4-d1c2-4fc7-a5de-5f23111196c8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login_Feature/loginWithInvalidCredential</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0f6768e3-dd8e-4b45-8d9c-c243d0de461e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/day1/dataLogin</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>0f6768e3-dd8e-4b45-8d9c-c243d0de461e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>userName</value>
         <variableId>b1fbeb39-5d23-4303-b8e3-1ea2795ee69d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0f6768e3-dd8e-4b45-8d9c-c243d0de461e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>d80536c1-f25c-49b8-934a-b8c0f382d688</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0f6768e3-dd8e-4b45-8d9c-c243d0de461e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>condition</value>
         <variableId>56ef8194-7b08-4627-b335-8631c192d588</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
