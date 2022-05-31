<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>社員管理システム - 新規</title>
  </head>
  <body>
    <h2>照会</h2>
    <div>
      <form action="/employee/new.create">
        <div class="mb-3">
          <label for="jobNumber" class="form-label">社員番号</label>
          <input
            type="text"
            class="form-control"
            id="jobNumber"
            name="jobNumber"
            maxlength="8"
            pattern="[A-Z][A-Za-z]{0,3}[0-9]{4,7}"
            required
          />
        </div>
        <div class="mb-3">
          <label for="name" class="form-label">名前</label>
          <input type="text" class="form-control" id="name" name="name" />
        </div>
        <div class="mb-3">
          <label for="age" class="form-label">年齢</label>
          <input type="number" class="form-control" id="age" name="age" />
        </div>
        <div class="mb-3">
          <label for="gender" class="form-label">性別</label>
          <div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="gender"
                id="gender-null"
                value=""
              />
              <label class="form-check-label" for="gender-null" checked
                >未選択</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="gender"
                id="gender-male"
                value="male"
              />
              <label class="form-check-label" for="gender-male">男</label>
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="gender"
                id="gender-female"
                value="female"
              />
              <label class="form-check-label" for="gender-female">女</label>
            </div>
          </div>
        </div>
        <div class="mb-3">
          <label for="maritalStatus" class="form-label">配偶者の有無</label>
          <div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="maritalStatus"
                id="marital-status-null"
                value=""
              />
              <label class="form-check-label" for="marital-status-null" checked
                >未選択</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="maritalStatus"
                id="marital-status-married"
                value="male"
              />
              <label class="form-check-label" for="marital-status-married"
                >既婚</label
              >
            </div>
            <div class="form-check form-check-inline">
              <input
                class="form-check-input"
                type="radio"
                name="maritalStatus"
                id="marital-status-unmarried"
                value="female"
              />
              <label class="form-check-label" for="marital-status-unmarried"
                >未婚</label
              >
            </div>
          </div>
        </div>
        <div class="mb-3">
          <label class="form-label" for="hireDate">入社日</label>
          <input
            type="date"
            class="form-control"
            id="hireDate"
            name="hireDate"
            placeholder="入社日"
          />
        </div>
        <div class="mb-3">
          <label class="form-label" for="birthDate">生年月日</label>
          <input
            type="date"
            class="form-control"
            id="birthDate"
            name="birthDate"
            placeholder="生年月日"
          />
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">Eメール</label>
          <input type="email" class="form-control" id="email" />
        </div>
        <div class="mb-3">
          <label for="phone" class="form-label">携帯番号</label>
          <input type="tel" class="form-control" id="phone" />
        </div>
        <div class="mb-3">
          <label for="accountName" class="form-label">アカウント</label>
          <input
            type="text"
            class="form-control"
            id="accountName"
            name="accountName"
          />
        </div>
        <div class="mb-3">
          <label for="accountPassword" class="form-label">パスワード</label>
          <input
            type="password"
            class="form-control"
            id="accountPassword"
            name="accountPassword"
          />
        </div>
        <button type="submit" class="btn btn-primary">作成</button>
      </form>
    </div>
  </body>
</html>
