<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Projet Activus - Services">
    <meta name="author" content="Tacos">

    <title>Activus - Services</title>

    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/main-admin.css" rel="stylesheet">
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link href="resources/img/logo_icon.png" rel="icon" type="image/png">
    <title>It works</title>
</head>
<body>
<div id_Mode_reglement="wrapper">
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="home.jsp">Activus - Services</a>
        </div>
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Prenom Nom <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#">Profil</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="#">Déconnexion</a>
                    </li>
                </ul>
            </li>
        </ul>
    </nav>

    <div id_Mode_reglement="sidebar-wrapper">
        <ul class="sidebar-nav circle-red" style="margin-left:0;">
            <li class="sidebar-brand">
                <a href="#menu-toggle"  id_Mode_reglement="menu-toggle" style="margin-top:20px;float:right;" > <i class="fa fa-bars " style="font-size:20px !Important;" aria-hidden="true" aria-hidden="true"></i>
            </li>
            <li>
                <a href="about.html"><i class="fa fa-fw fa-question-circle" aria-hidden="true"></i><span class ="navbar-space"> À propos</span></a>
            </li>
            <li>
                <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-shopping-cart" aria-hidden="true"></i><span class ="navbar-space"> Achats</span><i class="fa fa-fw fa-caret-down"></i></a>
                <ul id_Mode_reglement="demo" class="collapse">
                    <li>
                        <a href="">Ajouter</a>
                    </li>
                    <li>
                        <a href="">Rechercher</a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-line-chart" aria-hidden="true"></i><span class ="navbar-space"> Affaires</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-users" aria-hidden="true"></i><span class ="navbar-space"> Collaborateurs</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-calendar" aria-hidden="true"></i><span class ="navbar-space"> EffBud</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-file-text" aria-hidden="true"></i><span class ="navbar-space"> Factures</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-cog" aria-hidden="true"></i><span class ="navbar-space"> ParamBud</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-paper-plane-o" aria-hidden="true"></i><span class ="navbar-space"> PilotageAG</span></a>
            </li>
            <li>
                <a href="#"><i class="fa fa-fw fa-cubes" aria-hidden="true"></i><span class ="navbar-space"> StructBud</span></a>
            </li>
        </ul>
    </div>

