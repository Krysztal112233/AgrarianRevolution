<h1 align="center"> 高级农业-核心 | Advanced_Agriculture-core </h1>

![Logo](others/AdvAgri.png)

<h2 align="center"> 一个旨在拓展 Minecraft 原版与农业相关的体验的模组 </h2>

<h3 align="center">构建状态以及项目信息</br> </h3>

<div align="center"> <img src="https://circleci.com/gh/MysteriousStudio/AdvancedAgriculture-core.svg?style=svg" alt="Circle CI"/> <img src="https://github.com/MysteriousStudio/AdvancedAgriculture-core/workflows/build/badge.svg"> <img src="https://img.shields.io/badge/License-GPLv3-brightgreen" alt="License"> <img src="https://img.shields.io/badge/Language-Java-blue" alt="Language"> </div>

### 特别感谢

- Fabric Team
- All the contributors no matter translator or programmer or painter and so on
- All the developer and who love this mod

### 注意!

当您使用本模组时, 即代表您已阅读[用户须知](./markdowns/UserNoticeCN.md)

_[Wiki](https://github.com/MysteriousStudio/AdvancedAgriculture-core/wiki)_ 正在施工中.

[Commit 规范](./markdowns/CommitStandardCN.md)

项目中的实现逻辑以及发展逻辑大多数可以从 wiki 中获知.

---

## 当前状态

截至 2021 年 8 月 3 日，本项目仍然处于开发状态，没有产生任何可以用于游玩的版本。

## 开发进度

- [x] Dev
- [ ] Alpha
- [ ] Beta
- [ ] 正式版

可以通过查看 _[项目看板](https://github.com/MysteriousStudio/AdvancedAgriculture-core/projects/1)_ 来查看具体的开发进度与我们的工作

版本命名规则请移步 [](markdowns/VersionName.md)

## 如何构建

### 手动构建

由于高级农业-核心采用分体开发策略，所以我们使用了子仓库。目前处于子仓库态的有以下内容

- [Lang 文件](https://github.com/MysteriousStudio/AdvancedAgriculture-core-lang)
- [合成表，战利品列表](https://github.com/MysteriousStudio/AdvancedAgriculture-core-data)
- [材质](https://github.com/MysteriousStudio/AdvancedAgriculture-core-textures)

因此，需要在克隆后刷新子模块才可以完整的构建高级农业-核心。

```
git submodule update --init --recursive
```

在这之后，就可以使用 Gradle 进行构建了

```shell
gradle build
```

在工作完成后，最终的构建结果会出现在`./build/libs/`中。

### 自动构建

我们启动了 `Github Action`，`Circle CI` 两种 CI 来为我们的项目执行构建。每当主仓库有更新后他们都会自动执行一次。您可以通过 StatusCheck 来进入我们的 CI，在 CI
结束工作后都会提交最终构建结果，您可以下载他们来运行。

## 作出贡献

您可以通过以下的方法为模组进行贡献：

- 为模组主仓库提 PR
- 为模组子仓库提 PR
- 为模组编写 Wiki
- 为模组进行一定程度的推广
- 为模组的语言全球化进行贡献
- 为模组所需求的模型，材质等进行设计
- 为我们资助一些经费
- 成为模组开发者的一员
- 提出合理的issues

---

## 资助我们，让我们有外在动力持续开发

到目前为止，高级农业-核心的开发者，材质画师，建模师，策划全部为学生或者无工作身份，利用业余时间进行开发。

您的一份资助能减轻我们的财政负担，或是服务器开销，软件的开销，或者是买一杯奶茶，饮料喝。

### 资助方案：

- [爱发电](https://afdian.net/@AdvAgri_Core)
