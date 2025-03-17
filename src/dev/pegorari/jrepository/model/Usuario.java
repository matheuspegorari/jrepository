package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Usuario implements SankhyaEntity<Usuario> {

   private Timestamp dtLimAcesso;
   private String exibirValAnalRent;
   private byte[] foto;
   private String impNfcCentral;
   private String cpf;
   private Timestamp dtAlter;
   private String infRecSen;
   private String instalaPacotesS;
   private String interno;
   private String locale;
   private BigDecimal minutosFin;
   private BigDecimal nivel;
   private String nivelAcesso;
   private String nomeFila;
   private String nomeUsu;
   private String nomeUsuCplt;
   private String notSlaFila;
   private String permAltMoeda;
   private String permExpRel;
   private String permImprimeRel;
   private BigDecimal portaSmtp;
   private BigDecimal renDiasValJur;
   private String restringeCart;
   private String rg;
   private String segurancaSmtp;
   private String senhaAntiga;
   private String senhaNova;
   private String senhaNuncaExpira;
   private String senhaRepete;
   private String senhaSmtp;
   private String servidorSmtp;
   private String temEcf;
   private String tipoSmtp;
   private BigDecimal toleranciaAcesso;
   private BigDecimal topBaixaDespesa;
   private BigDecimal topBaixaReceita;
   private String usuarioSmtp;
   private String verCabPropria;
   private String visAcesOutUsu;
   private BigDecimal vlrMaxAut;
   private Timestamp dtNasc;
   private Timestamp dtUltAcesso;
   private Timestamp dtUltimaSenha;
   private String email;
   private String emailSolLib;
   private BigDecimal accountPartner;
   private BigDecimal codEquip;
   private String acessaFormulaRel;
   private String acessoVisualCab;
   private String altCtaFat;
   private String altCtaImpBol;
   private String altOrdCFech;
   private String apenasCompLib;
   private String aprovCot;
   private String avisaVarPreco;
   private String baixaDesp;
   private String baixaRec;
   private String caixa;
   private BigDecimal codCargaAcesso;
   private BigDecimal codCenCusPad;
   private BigDecimal codContatoPerfil;
   private BigDecimal codCtaBcoInt;
   private BigDecimal codCtaBcoInt2;
   private BigDecimal codEmp;
   private BigDecimal codEtapa;
   private BigDecimal codFunc;
   private BigDecimal codGrupo;
   private BigDecimal codParc;
   private BigDecimal codParcPerfil;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private String contaAcesso;
   private String contaGol;
   private String ignoraHorasCruz;
   private String excLibOrc;
   private BigDecimal codPerfil;
   private BigDecimal corCodigo;
   private String gestor;
   private String grupoRede;
   private String ignoraLdap;
   private String implantador;
   private String operacional;
   private String proprietario;
   private String timBaixaWord;
   private String timPathScanner;
   private String timVerTodasFacs;
   private String usuRede;
   private String timBaixTitRecAbe;
   private String selectWcapo;
   private String codIdeConect;
   private String integraEConect;
   private String idPerfilEConect;
   private BigDecimal senhaEConect;
   private String permRepErro;
   private BigDecimal tipoUsu;
   private String tipEnvNotSol;
   private String abreGaveta;
   private String acessoPdvCancItens;
   private String acessoPdvSang;
   private String acessoPdvSangPDesp;
   private String acessoPdvSupr;
   private String tokenCheckout;
   private String accountEmail;
   private String atunVersao;
   private BigDecimal nuVersao;
   private Timestamp accountDhExpira;
   private String accountId;
   private String accountNomeFoto;
   private char[] accountToken;
   private String imp2SansUpcai;
   private String descTotalNotaPdv;

   public Timestamp getDtLimAcesso() {
        return dtLimAcesso;
   }

   public void setDtLimAcesso(Timestamp dtLimAcesso) {
        this.dtLimAcesso = dtLimAcesso;
   }

   public String getExibirValAnalRent() {
        return exibirValAnalRent;
   }

   public void setExibirValAnalRent(String exibirValAnalRent) {
        this.exibirValAnalRent = exibirValAnalRent;
   }

   public byte[] getFoto() {
        return foto;
   }

   public void setFoto(byte[] foto) {
        this.foto = foto;
   }

   public String getImpNfcCentral() {
        return impNfcCentral;
   }

   public void setImpNfcCentral(String impNfcCentral) {
        this.impNfcCentral = impNfcCentral;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        this.cpf = cpf;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getInfRecSen() {
        return infRecSen;
   }

   public void setInfRecSen(String infRecSen) {
        this.infRecSen = infRecSen;
   }

   public String getInstalaPacotesS() {
        return instalaPacotesS;
   }

   public void setInstalaPacotesS(String instalaPacotesS) {
        this.instalaPacotesS = instalaPacotesS;
   }

   public String getInterno() {
        return interno;
   }

   public void setInterno(String interno) {
        this.interno = interno;
   }

   public String getLocale() {
        return locale;
   }

   public void setLocale(String locale) {
        this.locale = locale;
   }

   public BigDecimal getMinutosFin() {
        return minutosFin;
   }

   public void setMinutosFin(BigDecimal minutosFin) {
        this.minutosFin = minutosFin;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        this.nivel = nivel;
   }

   public String getNivelAcesso() {
        return nivelAcesso;
   }

   public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
   }

   public String getNomeFila() {
        return nomeFila;
   }

   public void setNomeFila(String nomeFila) {
        this.nomeFila = nomeFila;
   }

   public String getNomeUsu() {
        return nomeUsu;
   }

   public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
   }

   public String getNomeUsuCplt() {
        return nomeUsuCplt;
   }

   public void setNomeUsuCplt(String nomeUsuCplt) {
        this.nomeUsuCplt = nomeUsuCplt;
   }

   public String getNotSlaFila() {
        return notSlaFila;
   }

   public void setNotSlaFila(String notSlaFila) {
        this.notSlaFila = notSlaFila;
   }

   public String getPermAltMoeda() {
        return permAltMoeda;
   }

   public void setPermAltMoeda(String permAltMoeda) {
        this.permAltMoeda = permAltMoeda;
   }

   public String getPermExpRel() {
        return permExpRel;
   }

   public void setPermExpRel(String permExpRel) {
        this.permExpRel = permExpRel;
   }

   public String getPermImprimeRel() {
        return permImprimeRel;
   }

   public void setPermImprimeRel(String permImprimeRel) {
        this.permImprimeRel = permImprimeRel;
   }

   public BigDecimal getPortaSmtp() {
        return portaSmtp;
   }

   public void setPortaSmtp(BigDecimal portaSmtp) {
        this.portaSmtp = portaSmtp;
   }

   public BigDecimal getRenDiasValJur() {
        return renDiasValJur;
   }

   public void setRenDiasValJur(BigDecimal renDiasValJur) {
        this.renDiasValJur = renDiasValJur;
   }

   public String getRestringeCart() {
        return restringeCart;
   }

   public void setRestringeCart(String restringeCart) {
        this.restringeCart = restringeCart;
   }

   public String getRg() {
        return rg;
   }

   public void setRg(String rg) {
        this.rg = rg;
   }

   public String getSegurancaSmtp() {
        return segurancaSmtp;
   }

   public void setSegurancaSmtp(String segurancaSmtp) {
        this.segurancaSmtp = segurancaSmtp;
   }

   public String getSenhaAntiga() {
        return senhaAntiga;
   }

   public void setSenhaAntiga(String senhaAntiga) {
        this.senhaAntiga = senhaAntiga;
   }

   public String getSenhaNova() {
        return senhaNova;
   }

   public void setSenhaNova(String senhaNova) {
        this.senhaNova = senhaNova;
   }

   public String getSenhaNuncaExpira() {
        return senhaNuncaExpira;
   }

   public void setSenhaNuncaExpira(String senhaNuncaExpira) {
        this.senhaNuncaExpira = senhaNuncaExpira;
   }

   public String getSenhaRepete() {
        return senhaRepete;
   }

   public void setSenhaRepete(String senhaRepete) {
        this.senhaRepete = senhaRepete;
   }

   public String getSenhaSmtp() {
        return senhaSmtp;
   }

   public void setSenhaSmtp(String senhaSmtp) {
        this.senhaSmtp = senhaSmtp;
   }

   public String getServidorSmtp() {
        return servidorSmtp;
   }

   public void setServidorSmtp(String servidorSmtp) {
        this.servidorSmtp = servidorSmtp;
   }

   public String getTemEcf() {
        return temEcf;
   }

   public void setTemEcf(String temEcf) {
        this.temEcf = temEcf;
   }

   public String getTipoSmtp() {
        return tipoSmtp;
   }

   public void setTipoSmtp(String tipoSmtp) {
        this.tipoSmtp = tipoSmtp;
   }

   public BigDecimal getToleranciaAcesso() {
        return toleranciaAcesso;
   }

   public void setToleranciaAcesso(BigDecimal toleranciaAcesso) {
        this.toleranciaAcesso = toleranciaAcesso;
   }

   public BigDecimal getTopBaixaDespesa() {
        return topBaixaDespesa;
   }

   public void setTopBaixaDespesa(BigDecimal topBaixaDespesa) {
        this.topBaixaDespesa = topBaixaDespesa;
   }

   public BigDecimal getTopBaixaReceita() {
        return topBaixaReceita;
   }

   public void setTopBaixaReceita(BigDecimal topBaixaReceita) {
        this.topBaixaReceita = topBaixaReceita;
   }

   public String getUsuarioSmtp() {
        return usuarioSmtp;
   }

   public void setUsuarioSmtp(String usuarioSmtp) {
        this.usuarioSmtp = usuarioSmtp;
   }

   public String getVerCabPropria() {
        return verCabPropria;
   }

   public void setVerCabPropria(String verCabPropria) {
        this.verCabPropria = verCabPropria;
   }

   public String getVisAcesOutUsu() {
        return visAcesOutUsu;
   }

   public void setVisAcesOutUsu(String visAcesOutUsu) {
        this.visAcesOutUsu = visAcesOutUsu;
   }

   public BigDecimal getVlrMaxAut() {
        return vlrMaxAut;
   }

   public void setVlrMaxAut(BigDecimal vlrMaxAut) {
        this.vlrMaxAut = vlrMaxAut;
   }

   public Timestamp getDtNasc() {
        return dtNasc;
   }

   public void setDtNasc(Timestamp dtNasc) {
        this.dtNasc = dtNasc;
   }

   public Timestamp getDtUltAcesso() {
        return dtUltAcesso;
   }

   public void setDtUltAcesso(Timestamp dtUltAcesso) {
        this.dtUltAcesso = dtUltAcesso;
   }

   public Timestamp getDtUltimaSenha() {
        return dtUltimaSenha;
   }

   public void setDtUltimaSenha(Timestamp dtUltimaSenha) {
        this.dtUltimaSenha = dtUltimaSenha;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public String getEmailSolLib() {
        return emailSolLib;
   }

   public void setEmailSolLib(String emailSolLib) {
        this.emailSolLib = emailSolLib;
   }

   public BigDecimal getAccountPartner() {
        return accountPartner;
   }

   public void setAccountPartner(BigDecimal accountPartner) {
        this.accountPartner = accountPartner;
   }

   public BigDecimal getCodEquip() {
        return codEquip;
   }

   public void setCodEquip(BigDecimal codEquip) {
        this.codEquip = codEquip;
   }

   public String getAcessaFormulaRel() {
        return acessaFormulaRel;
   }

   public void setAcessaFormulaRel(String acessaFormulaRel) {
        this.acessaFormulaRel = acessaFormulaRel;
   }

   public String getAcessoVisualCab() {
        return acessoVisualCab;
   }

   public void setAcessoVisualCab(String acessoVisualCab) {
        this.acessoVisualCab = acessoVisualCab;
   }

   public String getAltCtaFat() {
        return altCtaFat;
   }

   public void setAltCtaFat(String altCtaFat) {
        this.altCtaFat = altCtaFat;
   }

   public String getAltCtaImpBol() {
        return altCtaImpBol;
   }

   public void setAltCtaImpBol(String altCtaImpBol) {
        this.altCtaImpBol = altCtaImpBol;
   }

   public String getAltOrdCFech() {
        return altOrdCFech;
   }

   public void setAltOrdCFech(String altOrdCFech) {
        this.altOrdCFech = altOrdCFech;
   }

   public String getApenasCompLib() {
        return apenasCompLib;
   }

   public void setApenasCompLib(String apenasCompLib) {
        this.apenasCompLib = apenasCompLib;
   }

   public String getAprovCot() {
        return aprovCot;
   }

   public void setAprovCot(String aprovCot) {
        this.aprovCot = aprovCot;
   }

   public String getAvisaVarPreco() {
        return avisaVarPreco;
   }

   public void setAvisaVarPreco(String avisaVarPreco) {
        this.avisaVarPreco = avisaVarPreco;
   }

   public String getBaixaDesp() {
        return baixaDesp;
   }

   public void setBaixaDesp(String baixaDesp) {
        this.baixaDesp = baixaDesp;
   }

   public String getBaixaRec() {
        return baixaRec;
   }

   public void setBaixaRec(String baixaRec) {
        this.baixaRec = baixaRec;
   }

   public String getCaixa() {
        return caixa;
   }

   public void setCaixa(String caixa) {
        this.caixa = caixa;
   }

   public BigDecimal getCodCargaAcesso() {
        return codCargaAcesso;
   }

   public void setCodCargaAcesso(BigDecimal codCargaAcesso) {
        this.codCargaAcesso = codCargaAcesso;
   }

   public BigDecimal getCodCenCusPad() {
        return codCenCusPad;
   }

   public void setCodCenCusPad(BigDecimal codCenCusPad) {
        this.codCenCusPad = codCenCusPad;
   }

   public BigDecimal getCodContatoPerfil() {
        return codContatoPerfil;
   }

   public void setCodContatoPerfil(BigDecimal codContatoPerfil) {
        this.codContatoPerfil = codContatoPerfil;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        this.codCtaBcoInt = codCtaBcoInt;
   }

   public BigDecimal getCodCtaBcoInt2() {
        return codCtaBcoInt2;
   }

   public void setCodCtaBcoInt2(BigDecimal codCtaBcoInt2) {
        this.codCtaBcoInt2 = codCtaBcoInt2;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodGrupo() {
        return codGrupo;
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        this.codGrupo = codGrupo;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodParcPerfil() {
        return codParcPerfil;
   }

   public void setCodParcPerfil(BigDecimal codParcPerfil) {
        this.codParcPerfil = codParcPerfil;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        this.codVend = codVend;
   }

   public String getContaAcesso() {
        return contaAcesso;
   }

   public void setContaAcesso(String contaAcesso) {
        this.contaAcesso = contaAcesso;
   }

   public String getContaGol() {
        return contaGol;
   }

   public void setContaGol(String contaGol) {
        this.contaGol = contaGol;
   }

   public String getIgnoraHorasCruz() {
        return ignoraHorasCruz;
   }

   public void setIgnoraHorasCruz(String ignoraHorasCruz) {
        this.ignoraHorasCruz = ignoraHorasCruz;
   }

   public String getExcLibOrc() {
        return excLibOrc;
   }

   public void setExcLibOrc(String excLibOrc) {
        this.excLibOrc = excLibOrc;
   }

   public BigDecimal getCodPerfil() {
        return codPerfil;
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        this.codPerfil = codPerfil;
   }

   public BigDecimal getCorCodigo() {
        return corCodigo;
   }

   public void setCorCodigo(BigDecimal corCodigo) {
        this.corCodigo = corCodigo;
   }

   public String getGestor() {
        return gestor;
   }

   public void setGestor(String gestor) {
        this.gestor = gestor;
   }

   public String getGrupoRede() {
        return grupoRede;
   }

   public void setGrupoRede(String grupoRede) {
        this.grupoRede = grupoRede;
   }

   public String getIgnoraLdap() {
        return ignoraLdap;
   }

   public void setIgnoraLdap(String ignoraLdap) {
        this.ignoraLdap = ignoraLdap;
   }

   public String getImplantador() {
        return implantador;
   }

   public void setImplantador(String implantador) {
        this.implantador = implantador;
   }

   public String getOperacional() {
        return operacional;
   }

   public void setOperacional(String operacional) {
        this.operacional = operacional;
   }

   public String getProprietario() {
        return proprietario;
   }

   public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
   }

   public String getTimBaixaWord() {
        return timBaixaWord;
   }

   public void setTimBaixaWord(String timBaixaWord) {
        this.timBaixaWord = timBaixaWord;
   }

   public String getTimPathScanner() {
        return timPathScanner;
   }

   public void setTimPathScanner(String timPathScanner) {
        this.timPathScanner = timPathScanner;
   }

   public String getTimVerTodasFacs() {
        return timVerTodasFacs;
   }

   public void setTimVerTodasFacs(String timVerTodasFacs) {
        this.timVerTodasFacs = timVerTodasFacs;
   }

   public String getUsuRede() {
        return usuRede;
   }

   public void setUsuRede(String usuRede) {
        this.usuRede = usuRede;
   }

   public String getTimBaixTitRecAbe() {
        return timBaixTitRecAbe;
   }

   public void setTimBaixTitRecAbe(String timBaixTitRecAbe) {
        this.timBaixTitRecAbe = timBaixTitRecAbe;
   }

   public String getSelectWcapo() {
        return selectWcapo;
   }

   public void setSelectWcapo(String selectWcapo) {
        this.selectWcapo = selectWcapo;
   }

   public String getCodIdeConect() {
        return codIdeConect;
   }

   public void setCodIdeConect(String codIdeConect) {
        this.codIdeConect = codIdeConect;
   }

   public String getIntegraEConect() {
        return integraEConect;
   }

   public void setIntegraEConect(String integraEConect) {
        this.integraEConect = integraEConect;
   }

   public String getIdPerfilEConect() {
        return idPerfilEConect;
   }

   public void setIdPerfilEConect(String idPerfilEConect) {
        this.idPerfilEConect = idPerfilEConect;
   }

   public BigDecimal getSenhaEConect() {
        return senhaEConect;
   }

   public void setSenhaEConect(BigDecimal senhaEConect) {
        this.senhaEConect = senhaEConect;
   }

   public String getPermRepErro() {
        return permRepErro;
   }

   public void setPermRepErro(String permRepErro) {
        this.permRepErro = permRepErro;
   }

   public BigDecimal getTipoUsu() {
        return tipoUsu;
   }

   public void setTipoUsu(BigDecimal tipoUsu) {
        this.tipoUsu = tipoUsu;
   }

   public String getTipEnvNotSol() {
        return tipEnvNotSol;
   }

   public void setTipEnvNotSol(String tipEnvNotSol) {
        this.tipEnvNotSol = tipEnvNotSol;
   }

   public String getAbreGaveta() {
        return abreGaveta;
   }

   public void setAbreGaveta(String abreGaveta) {
        this.abreGaveta = abreGaveta;
   }

   public String getAcessoPdvCancItens() {
        return acessoPdvCancItens;
   }

   public void setAcessoPdvCancItens(String acessoPdvCancItens) {
        this.acessoPdvCancItens = acessoPdvCancItens;
   }

   public String getAcessoPdvSang() {
        return acessoPdvSang;
   }

   public void setAcessoPdvSang(String acessoPdvSang) {
        this.acessoPdvSang = acessoPdvSang;
   }

   public String getAcessoPdvSangPDesp() {
        return acessoPdvSangPDesp;
   }

   public void setAcessoPdvSangPDesp(String acessoPdvSangPDesp) {
        this.acessoPdvSangPDesp = acessoPdvSangPDesp;
   }

   public String getAcessoPdvSupr() {
        return acessoPdvSupr;
   }

   public void setAcessoPdvSupr(String acessoPdvSupr) {
        this.acessoPdvSupr = acessoPdvSupr;
   }

   public String getTokenCheckout() {
        return tokenCheckout;
   }

   public void setTokenCheckout(String tokenCheckout) {
        this.tokenCheckout = tokenCheckout;
   }

   public String getAccountEmail() {
        return accountEmail;
   }

   public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
   }

   public String getAtunVersao() {
        return atunVersao;
   }

   public void setAtunVersao(String atunVersao) {
        this.atunVersao = atunVersao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   public Timestamp getAccountDhExpira() {
        return accountDhExpira;
   }

   public void setAccountDhExpira(Timestamp accountDhExpira) {
        this.accountDhExpira = accountDhExpira;
   }

   public String getAccountId() {
        return accountId;
   }

   public void setAccountId(String accountId) {
        this.accountId = accountId;
   }

   public String getAccountNomeFoto() {
        return accountNomeFoto;
   }

   public void setAccountNomeFoto(String accountNomeFoto) {
        this.accountNomeFoto = accountNomeFoto;
   }

   public char[] getAccountToken() {
        return accountToken;
   }

   public void setAccountToken(char[] accountToken) {
        this.accountToken = accountToken;
   }

   public String getImp2SansUpcai() {
        return imp2SansUpcai;
   }

   public void setImp2SansUpcai(String imp2SansUpcai) {
        this.imp2SansUpcai = imp2SansUpcai;
   }

   public String getDescTotalNotaPdv() {
        return descTotalNotaPdv;
   }

   public void setDescTotalNotaPdv(String descTotalNotaPdv) {
        this.descTotalNotaPdv = descTotalNotaPdv;
   }

   @Override
   public String getEntityName() {
        return "Usuario";
   }

   @Override
   public Usuario fromVO(DynamicVO vo) {
        this.dtLimAcesso = vo.asTimestamp("DTLIMACESSO");
        this.exibirValAnalRent = vo.asString("EXIBIRVALANALRENT");
        this.foto = vo.asBlob("FOTO");
        this.impNfcCentral = vo.asString("IMPNFCCENTRAL");
        this.cpf = vo.asString("CPF");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.infRecSen = vo.asString("INFRECSEN");
        this.instalaPacotesS = vo.asString("INSTALAPACOTESS");
        this.interno = vo.asString("INTERNO");
        this.locale = vo.asString("LOCALE");
        this.minutosFin = vo.asBigDecimal("MINUTOSFIN");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.nivelAcesso = vo.asString("NIVELACESSO");
        this.nomeFila = vo.asString("NOMEFILA");
        this.nomeUsu = vo.asString("NOMEUSU");
        this.nomeUsuCplt = vo.asString("NOMEUSUCPLT");
        this.notSlaFila = vo.asString("NOTSLAFILA");
        this.permAltMoeda = vo.asString("PERMALTMOEDA");
        this.permExpRel = vo.asString("PERMEXPREL");
        this.permImprimeRel = vo.asString("PERMIMPRIMEREL");
        this.portaSmtp = vo.asBigDecimal("PORTASMTP");
        this.renDiasValJur = vo.asBigDecimal("RENDIASVALJUR");
        this.restringeCart = vo.asString("RESTRINGECART");
        this.rg = vo.asString("RG");
        this.segurancaSmtp = vo.asString("SEGURANCASMTP");
        this.senhaAntiga = vo.asString("SENHAANTIGA");
        this.senhaNova = vo.asString("SENHANOVA");
        this.senhaNuncaExpira = vo.asString("SENHANUNCAEXPIRA");
        this.senhaRepete = vo.asString("SENHAREPETE");
        this.senhaSmtp = vo.asString("SENHASMTP");
        this.servidorSmtp = vo.asString("SERVIDORSMTP");
        this.temEcf = vo.asString("TEMECF");
        this.tipoSmtp = vo.asString("TIPOSMTP");
        this.toleranciaAcesso = vo.asBigDecimal("TOLERANCIAACESSO");
        this.topBaixaDespesa = vo.asBigDecimal("TOPBAIXADESPESA");
        this.topBaixaReceita = vo.asBigDecimal("TOPBAIXARECEITA");
        this.usuarioSmtp = vo.asString("USUARIOSMTP");
        this.verCabPropria = vo.asString("VERCABPROPRIA");
        this.visAcesOutUsu = vo.asString("VISACESOUTUSU");
        this.vlrMaxAut = vo.asBigDecimal("VLRMAXAUT");
        this.dtNasc = vo.asTimestamp("DTNASC");
        this.dtUltAcesso = vo.asTimestamp("DTULTACESSO");
        this.dtUltimaSenha = vo.asTimestamp("DTULTIMASENHA");
        this.email = vo.asString("EMAIL");
        this.emailSolLib = vo.asString("EMAILSOLLIB");
        this.accountPartner = vo.asBigDecimal("ACCOUNTPARTNER");
        this.codEquip = vo.asBigDecimal("CODEQUIP");
        this.acessaFormulaRel = vo.asString("ACESSAFORMULAREL");
        this.acessoVisualCab = vo.asString("ACESSOVISUALCAB");
        this.altCtaFat = vo.asString("ALTCTAFAT");
        this.altCtaImpBol = vo.asString("ALTCTAIMPBOL");
        this.altOrdCFech = vo.asString("ALTORDCFECH");
        this.apenasCompLib = vo.asString("APENASCOMPLIB");
        this.aprovCot = vo.asString("APROVCOT");
        this.avisaVarPreco = vo.asString("AVISAVARPRECO");
        this.baixaDesp = vo.asString("BAIXADESP");
        this.baixaRec = vo.asString("BAIXAREC");
        this.caixa = vo.asString("CAIXA");
        this.codCargaAcesso = vo.asBigDecimal("CODCARGAACESSO");
        this.codCenCusPad = vo.asBigDecimal("CODCENCUSPAD");
        this.codContatoPerfil = vo.asBigDecimal("CODCONTATOPERFIL");
        this.codCtaBcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codCtaBcoInt2 = vo.asBigDecimal("CODCTABCOINT2");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codGrupo = vo.asBigDecimal("CODGRUPO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcPerfil = vo.asBigDecimal("CODPARCPERFIL");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.contaAcesso = vo.asString("CONTAACESSO");
        this.contaGol = vo.asString("CONTAGOL");
        this.ignoraHorasCruz = vo.asString("IGNORAHORASCRUZ");
        this.excLibOrc = vo.asString("EXCLIBORC");
        this.codPerfil = vo.asBigDecimal("CODPERFIL");
        this.corCodigo = vo.asBigDecimal("CORCODIGO");
        this.gestor = vo.asString("GESTOR");
        this.grupoRede = vo.asString("GRUPOREDE");
        this.ignoraLdap = vo.asString("IGNORALDAP");
        this.implantador = vo.asString("IMPLANTADOR");
        this.operacional = vo.asString("OPERACIONAL");
        this.proprietario = vo.asString("PROPRIETARIO");
        this.timBaixaWord = vo.asString("TIMBAIXAWORD");
        this.timPathScanner = vo.asString("TIMPATHSCANNER");
        this.timVerTodasFacs = vo.asString("TIMVERTODASFACS");
        this.usuRede = vo.asString("USUREDE");
        this.timBaixTitRecAbe = vo.asString("TIMBAIXTITRECABE");
        this.selectWcapo = vo.asString("SELECTWCAPO");
        this.codIdeConect = vo.asString("CODIDECONECT");
        this.integraEConect = vo.asString("INTEGRAECONECT");
        this.idPerfilEConect = vo.asString("IDPERFILECONECT");
        this.senhaEConect = vo.asBigDecimal("SENHAECONECT");
        this.permRepErro = vo.asString("PERMREPERRO");
        this.tipoUsu = vo.asBigDecimal("TIPOUSU");
        this.tipEnvNotSol = vo.asString("TIPENVNOTSOL");
        this.abreGaveta = vo.asString("ABREGAVETA");
        this.acessoPdvCancItens = vo.asString("ACESSOPDVCANCITENS");
        this.acessoPdvSang = vo.asString("ACESSOPDVSANG");
        this.acessoPdvSangPDesp = vo.asString("ACESSOPDVSANGPDESP");
        this.acessoPdvSupr = vo.asString("ACESSOPDVSUPR");
        this.tokenCheckout = vo.asString("TOKENCHECKOUT");
        this.accountEmail = vo.asString("ACCOUNTEMAIL");
        this.atunVersao = vo.asString("ATUNVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        this.accountDhExpira = vo.asTimestamp("ACCOUNTDHEXPIRA");
        this.accountId = vo.asString("ACCOUNTID");
        this.accountNomeFoto = vo.asString("ACCOUNTNOMEFOTO");
        this.accountToken = vo.asClob("ACCOUNTTOKEN");
        this.imp2SansUpcai = vo.asString("IMP2SANSUPCAI");
        this.descTotalNotaPdv = vo.asString("DESCTOTALNOTAPDV");
        return this;
   }
}
