package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Usuario extends AbstractSankhyaEntity<Usuario> {
   public Timestamp getDtLimAcesso() {
        return this.getVo().asTimestamp("DTLIMACESSO");
   }

   public void setDtLimAcesso(Timestamp dtLimAcesso) {
        markAsChanged("DTLIMACESSO", dtLimAcesso);
   }

   public String getExibirValAnalRent() {
        return this.getVo().asString("EXIBIRVALANALRENT");
   }

   public void setExibirValAnalRent(String exibirValAnalRent) {
        markAsChanged("EXIBIRVALANALRENT", exibirValAnalRent);
   }

   public byte[] getFoto() {
        return this.getVo().asBlob("FOTO");
   }

   public void setFoto(byte[] foto) {
        markAsChanged("FOTO", foto);
   }

   public String getImpNfcCentral() {
        return this.getVo().asString("IMPNFCENTRAL");
   }

   public void setImpNfcCentral(String impNfcCentral) {
        markAsChanged("IMPNFCENTRAL", impNfcCentral);
   }

   public String getCpf() {
        return this.getVo().asString("CPF");
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getInfRecSen() {
        return this.getVo().asString("INFRECSEN");
   }

   public void setInfRecSen(String infRecSen) {
        markAsChanged("INFRECSEN", infRecSen);
   }

   public String getInstalaPacotesS() {
        return this.getVo().asString("INSTALAPACOTESS");
   }

   public void setInstalaPacotesS(String instalaPacotesS) {
        markAsChanged("INSTALAPACOTESS", instalaPacotesS);
   }

   public String getInterno() {
        return this.getVo().asString("INTERNO");
   }

   public void setInterno(String interno) {
        markAsChanged("INTERNO", interno);
   }

   public String getLocale() {
        return this.getVo().asString("LOCALE");
   }

   public void setLocale(String locale) {
        markAsChanged("LOCALE", locale);
   }

   public BigDecimal getMinutosFin() {
        return this.getVo().asBigDecimal("MINUTOSFIN");
   }

   public void setMinutosFin(BigDecimal minutosFin) {
        markAsChanged("MINUTOSFIN", minutosFin);
   }

   public BigDecimal getNivel() {
        return this.getVo().asBigDecimal("NIVEL");
   }

   public void setNivel(BigDecimal nivel) {
        markAsChanged("NIVEL", nivel);
   }

   public String getNivelAcesso() {
        return this.getVo().asString("NIVELACESSO");
   }

   public void setNivelAcesso(String nivelAcesso) {
        markAsChanged("NIVELACESSO", nivelAcesso);
   }

   public String getNomeFila() {
        return this.getVo().asString("NOMEFILA");
   }

   public void setNomeFila(String nomeFila) {
        markAsChanged("NOMEFILA", nomeFila);
   }

   public String getNomeUsu() {
        return this.getVo().asString("NOMEUSU");
   }

   public void setNomeUsu(String nomeUsu) {
        markAsChanged("NOMEUSU", nomeUsu);
   }

   public String getNomeUsuCplt() {
        return this.getVo().asString("NOMEUSUCPLT");
   }

   public void setNomeUsuCplt(String nomeUsuCplt) {
        markAsChanged("NOMEUSUCPLT", nomeUsuCplt);
   }

   public String getNotSlaFila() {
        return this.getVo().asString("NOTSLAFILA");
   }

   public void setNotSlaFila(String notSlaFila) {
        markAsChanged("NOTSLAFILA", notSlaFila);
   }

   public String getPermAltMoeda() {
        return this.getVo().asString("PERMALTMOEDA");
   }

   public void setPermAltMoeda(String permAltMoeda) {
        markAsChanged("PERMALTMOEDA", permAltMoeda);
   }

   public String getPermExpRel() {
        return this.getVo().asString("PERMEXPREL");
   }

   public void setPermExpRel(String permExpRel) {
        markAsChanged("PERMEXPREL", permExpRel);
   }

   public String getPermImprimeRel() {
        return this.getVo().asString("PERMIMPRIMEREL");
   }

   public void setPermImprimeRel(String permImprimeRel) {
        markAsChanged("PERMIMPRIMEREL", permImprimeRel);
   }

   public BigDecimal getPortaSmtp() {
        return this.getVo().asBigDecimal("PORTASMTP");
   }

   public void setPortaSmtp(BigDecimal portaSmtp) {
        markAsChanged("PORTASMTP", portaSmtp);
   }

   public BigDecimal getRenDiasValJur() {
        return this.getVo().asBigDecimal("RENDIASVALJUR");
   }

   public void setRenDiasValJur(BigDecimal renDiasValJur) {
        markAsChanged("RENDIASVALJUR", renDiasValJur);
   }

   public String getRestringeCart() {
        return this.getVo().asString("RESTRINGECART");
   }

   public void setRestringeCart(String restringeCart) {
        markAsChanged("RESTRINGECART", restringeCart);
   }

   public String getRg() {
        return this.getVo().asString("RG");
   }

   public void setRg(String rg) {
        markAsChanged("RG", rg);
   }

   public String getSegurancaSmtp() {
        return this.getVo().asString("SEGURANCASMTP");
   }

   public void setSegurancaSmtp(String segurancaSmtp) {
        markAsChanged("SEGURANCASMTP", segurancaSmtp);
   }

   public String getSenhaAntiga() {
        return this.getVo().asString("SENHAANTIGA");
   }

   public void setSenhaAntiga(String senhaAntiga) {
        markAsChanged("SENHAANTIGA", senhaAntiga);
   }

   public String getSenhaNova() {
        return this.getVo().asString("SENHANOVA");
   }

   public void setSenhaNova(String senhaNova) {
        markAsChanged("SENHANOVA", senhaNova);
   }

   public String getSenhaNuncaExpira() {
        return this.getVo().asString("SENHANUNCAEXPIRA");
   }

   public void setSenhaNuncaExpira(String senhaNuncaExpira) {
        markAsChanged("SENHANUNCAEXPIRA", senhaNuncaExpira);
   }

   public String getSenhaRepete() {
        return this.getVo().asString("SENHAREPETE");
   }

   public void setSenhaRepete(String senhaRepete) {
        markAsChanged("SENHAREPETE", senhaRepete);
   }

   public String getSenhaSmtp() {
        return this.getVo().asString("SENHASMTP");
   }

   public void setSenhaSmtp(String senhaSmtp) {
        markAsChanged("SENHASMTP", senhaSmtp);
   }

   public String getServidorSmtp() {
        return this.getVo().asString("SERVIDORSMTP");
   }

   public void setServidorSmtp(String servidorSmtp) {
        markAsChanged("SERVIDORSMTP", servidorSmtp);
   }

   public String getTemEcf() {
        return this.getVo().asString("TEMECF");
   }

   public void setTemEcf(String temEcf) {
        markAsChanged("TEMECF", temEcf);
   }

   public String getTipoSmtp() {
        return this.getVo().asString("TIPOSMTP");
   }

   public void setTipoSmtp(String tipoSmtp) {
        markAsChanged("TIPOSMTP", tipoSmtp);
   }

   public BigDecimal getToleranciaAcesso() {
        return this.getVo().asBigDecimal("TOLERANCIAACESSO");
   }

   public void setToleranciaAcesso(BigDecimal toleranciaAcesso) {
        markAsChanged("TOLERANCIAACESSO", toleranciaAcesso);
   }

   public BigDecimal getTopBaixaDespesa() {
        return this.getVo().asBigDecimal("TOPBAIXADESPESA");
   }

   public void setTopBaixaDespesa(BigDecimal topBaixaDespesa) {
        markAsChanged("TOPBAIXADESPESA", topBaixaDespesa);
   }

   public BigDecimal getTopBaixaReceita() {
        return this.getVo().asBigDecimal("TOPBAIXARECEITA");
   }

   public void setTopBaixaReceita(BigDecimal topBaixaReceita) {
        markAsChanged("TOPBAIXARECEITA", topBaixaReceita);
   }

   public String getUsuarioSmtp() {
        return this.getVo().asString("USUARIOSMTP");
   }

   public void setUsuarioSmtp(String usuarioSmtp) {
        markAsChanged("USUARIOSMTP", usuarioSmtp);
   }

   public String getVerCabPropria() {
        return this.getVo().asString("VERCABPROPRIA");
   }

   public void setVerCabPropria(String verCabPropria) {
        markAsChanged("VERCABPROPRIA", verCabPropria);
   }

   public String getVisAcesOutUsu() {
        return this.getVo().asString("VISACESOUTUSU");
   }

   public void setVisAcesOutUsu(String visAcesOutUsu) {
        markAsChanged("VISACESOUTUSU", visAcesOutUsu);
   }

   public BigDecimal getVlrMaxAut() {
        return this.getVo().asBigDecimal("VLRMAXAUT");
   }

   public void setVlrMaxAut(BigDecimal vlrMaxAut) {
        markAsChanged("VLRMAXAUT", vlrMaxAut);
   }

   public Timestamp getDtNasc() {
        return this.getVo().asTimestamp("DTNASC");
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
   }

   public Timestamp getDtUltAcesso() {
        return this.getVo().asTimestamp("DTULTACESSO");
   }

   public void setDtUltAcesso(Timestamp dtUltAcesso) {
        markAsChanged("DTULTACESSO", dtUltAcesso);
   }

   public Timestamp getDtUltimaSenha() {
        return this.getVo().asTimestamp("DTULTIMASENHA");
   }

   public void setDtUltimaSenha(Timestamp dtUltimaSenha) {
        markAsChanged("DTULTIMASENHA", dtUltimaSenha);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getEmailSolLib() {
        return this.getVo().asString("EMAILSOLLIB");
   }

   public void setEmailSolLib(String emailSolLib) {
        markAsChanged("EMAILSOLLIB", emailSolLib);
   }

   public BigDecimal getAccountPartner() {
        return this.getVo().asBigDecimal("ACCOUNTPARTNER");
   }

   public void setAccountPartner(BigDecimal accountPartner) {
        markAsChanged("ACCOUNTPARTNER", accountPartner);
   }

   public BigDecimal getCodEquip() {
        return this.getVo().asBigDecimal("CODEQUIP");
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
   }

   public String getAcessaFormulaRel() {
        return this.getVo().asString("ACESSAFORMULAREL");
   }

   public void setAcessaFormulaRel(String acessaFormulaRel) {
        markAsChanged("ACESSAFORMULAREL", acessaFormulaRel);
   }

   public String getAcessoVisualCab() {
        return this.getVo().asString("ACESSOVISUALCAB");
   }

   public void setAcessoVisualCab(String acessoVisualCab) {
        markAsChanged("ACESSOVISUALCAB", acessoVisualCab);
   }

   public String getAltCtaFat() {
        return this.getVo().asString("ALTCTAFAT");
   }

   public void setAltCtaFat(String altCtaFat) {
        markAsChanged("ALTCTAFAT", altCtaFat);
   }

   public String getAltCtaImpBol() {
        return this.getVo().asString("ALTCTAIMPBOL");
   }

   public void setAltCtaImpBol(String altCtaImpBol) {
        markAsChanged("ALTCTAIMPBOL", altCtaImpBol);
   }

   public String getAltOrdCFech() {
        return this.getVo().asString("ALTORDCFECH");
   }

   public void setAltOrdCFech(String altOrdCFech) {
        markAsChanged("ALTORDCFECH", altOrdCFech);
   }

   public String getApenasCompLib() {
        return this.getVo().asString("APENASCOMPLIB");
   }

   public void setApenasCompLib(String apenasCompLib) {
        markAsChanged("APENASCOMPLIB", apenasCompLib);
   }

   public String getAprovCot() {
        return this.getVo().asString("APROVCOT");
   }

   public void setAprovCot(String aprovCot) {
        markAsChanged("APROVCOT", aprovCot);
   }

   public String getAvisaVarPreco() {
        return this.getVo().asString("AVISAVARPRECO");
   }

   public void setAvisaVarPreco(String avisaVarPreco) {
        markAsChanged("AVISAVARPRECO", avisaVarPreco);
   }

   public String getBaixaDesp() {
        return this.getVo().asString("BAIXADESP");
   }

   public void setBaixaDesp(String baixaDesp) {
        markAsChanged("BAIXADESP", baixaDesp);
   }

   public String getBaixaRec() {
        return this.getVo().asString("BAIXAREC");
   }

   public void setBaixaRec(String baixaRec) {
        markAsChanged("BAIXAREC", baixaRec);
   }

   public String getCaixa() {
        return this.getVo().asString("CAIXA");
   }

   public void setCaixa(String caixa) {
        markAsChanged("CAIXA", caixa);
   }

   public BigDecimal getCodCargaAcesso() {
        return this.getVo().asBigDecimal("CODCARGAACESSO");
   }

   public void setCodCargaAcesso(BigDecimal codCargaAcesso) {
        markAsChanged("CODCARGAACESSO", codCargaAcesso);
   }

   public BigDecimal getCodCenCusPad() {
        return this.getVo().asBigDecimal("CODCENCUSPAD");
   }

   public void setCodCenCusPad(BigDecimal codCenCusPad) {
        markAsChanged("CODCENCUSPAD", codCenCusPad);
   }

   public BigDecimal getCodContatoPerfil() {
        return this.getVo().asBigDecimal("CODCONTATOPERFIL");
   }

   public void setCodContatoPerfil(BigDecimal codContatoPerfil) {
        markAsChanged("CODCONTATOPERFIL", codContatoPerfil);
   }

   public BigDecimal getCodCtaBcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
   }

   public BigDecimal getCodCtaBcoInt2() {
        return this.getVo().asBigDecimal("CODCTABCOINT2");
   }

   public void setCodCtaBcoInt2(BigDecimal codCtaBcoInt2) {
        markAsChanged("CODCTABCOINT2", codCtaBcoInt2);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcPerfil() {
        return this.getVo().asBigDecimal("CODPARCPERFIL");
   }

   public void setCodParcPerfil(BigDecimal codParcPerfil) {
        markAsChanged("CODPARCPERFIL", codParcPerfil);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getContAcesso() {
        return this.getVo().asString("CONTACESSO");
   }

   public void setContAcesso(String contAcesso) {
        markAsChanged("CONTACESSO", contAcesso);
   }

   public String getContaGol() {
        return this.getVo().asString("CONTAGOL");
   }

   public void setContaGol(String contaGol) {
        markAsChanged("CONTAGOL", contaGol);
   }

   public String getIgnoraHorasCruz() {
        return this.getVo().asString("IGNORAHORASCRUZ");
   }

   public void setIgnoraHorasCruz(String ignoraHorasCruz) {
        markAsChanged("IGNORAHORASCRUZ", ignoraHorasCruz);
   }

   public String getExcLibOrc() {
        return this.getVo().asString("EXCLIBORC");
   }

   public void setExcLibOrc(String excLibOrc) {
        markAsChanged("EXCLIBORC", excLibOrc);
   }

   public BigDecimal getCodPerfil() {
        return this.getVo().asBigDecimal("CODPERFIL");
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        markAsChanged("CODPERFIL", codPerfil);
   }

   public BigDecimal getCorCodigo() {
        return this.getVo().asBigDecimal("CORCODIGO");
   }

   public void setCorCodigo(BigDecimal corCodigo) {
        markAsChanged("CORCODIGO", corCodigo);
   }

   public String getGestor() {
        return this.getVo().asString("GESTOR");
   }

   public void setGestor(String gestor) {
        markAsChanged("GESTOR", gestor);
   }

   public String getGrupoRede() {
        return this.getVo().asString("GRUPOREDE");
   }

   public void setGrupoRede(String grupoRede) {
        markAsChanged("GRUPOREDE", grupoRede);
   }

   public String getIgnoraLdap() {
        return this.getVo().asString("IGNORALDAP");
   }

   public void setIgnoraLdap(String ignoraLdap) {
        markAsChanged("IGNORALDAP", ignoraLdap);
   }

   public String getImplantador() {
        return this.getVo().asString("IMPLANTADOR");
   }

   public void setImplantador(String implantador) {
        markAsChanged("IMPLANTADOR", implantador);
   }

   public String getOperacional() {
        return this.getVo().asString("OPERACIONAL");
   }

   public void setOperacional(String operacional) {
        markAsChanged("OPERACIONAL", operacional);
   }

   public String getProprietario() {
        return this.getVo().asString("PROPRIETARIO");
   }

   public void setProprietario(String proprietario) {
        markAsChanged("PROPRIETARIO", proprietario);
   }

   public String getTimBaixaWord() {
        return this.getVo().asString("TIMBAIXAWORD");
   }

   public void setTimBaixaWord(String timBaixaWord) {
        markAsChanged("TIMBAIXAWORD", timBaixaWord);
   }

   public String getTimPathScanner() {
        return this.getVo().asString("TIMPATHSCANNER");
   }

   public void setTimPathScanner(String timPathScanner) {
        markAsChanged("TIMPATHSCANNER", timPathScanner);
   }

   public String getTimVerTodasFacs() {
        return this.getVo().asString("TIMVERTODASFACS");
   }

   public void setTimVerTodasFacs(String timVerTodasFacs) {
        markAsChanged("TIMVERTODASFACS", timVerTodasFacs);
   }

   public String getUsuRede() {
        return this.getVo().asString("USUREDE");
   }

   public void setUsuRede(String usuRede) {
        markAsChanged("USUREDE", usuRede);
   }

   public String getTimBaixTitRecabe() {
        return this.getVo().asString("TIMBAIXTITRECABE");
   }

   public void setTimBaixTitRecabe(String timBaixTitRecabe) {
        markAsChanged("TIMBAIXTITRECABE", timBaixTitRecabe);
   }

   public String getSelectWcapo() {
        return this.getVo().asString("SELECTWCAPO");
   }

   public void setSelectWcapo(String selectWcapo) {
        markAsChanged("SELECTWCAPO", selectWcapo);
   }

   public String getCodIdeConect() {
        return this.getVo().asString("CODIDECONECT");
   }

   public void setCodIdeConect(String codIdeConect) {
        markAsChanged("CODIDECONECT", codIdeConect);
   }

   public String getIntegraEconect() {
        return this.getVo().asString("INTEGRAECONECT");
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
   }

   public String getIdPerfilEconect() {
        return this.getVo().asString("IDPERFILECONECT");
   }

   public void setIdPerfilEconect(String idPerfilEconect) {
        markAsChanged("IDPERFILECONECT", idPerfilEconect);
   }

   public BigDecimal getSenhaEconect() {
        return this.getVo().asBigDecimal("SENHAECONECT");
   }

   public void setSenhaEconect(BigDecimal senhaEconect) {
        markAsChanged("SENHAECONECT", senhaEconect);
   }

   public String getPermRepErro() {
        return this.getVo().asString("PERMREPERRO");
   }

   public void setPermRepErro(String permRepErro) {
        markAsChanged("PERMREPERRO", permRepErro);
   }

   public BigDecimal getTipoUsu() {
        return this.getVo().asBigDecimal("TIPOUSU");
   }

   public void setTipoUsu(BigDecimal tipoUsu) {
        markAsChanged("TIPOUSU", tipoUsu);
   }

   public String getTipEnvNotSol() {
        return this.getVo().asString("TIPENVNOTSOL");
   }

   public void setTipEnvNotSol(String tipEnvNotSol) {
        markAsChanged("TIPENVNOTSOL", tipEnvNotSol);
   }

   public String getAbreGaveta() {
        return this.getVo().asString("ABREGAVETA");
   }

   public void setAbreGaveta(String abreGaveta) {
        markAsChanged("ABREGAVETA", abreGaveta);
   }

   public String getAcessoPdvCancItens() {
        return this.getVo().asString("ACESSOPDVCANCITENS");
   }

   public void setAcessoPdvCancItens(String acessoPdvCancItens) {
        markAsChanged("ACESSOPDVCANCITENS", acessoPdvCancItens);
   }

   public String getAcessoPdvSang() {
        return this.getVo().asString("ACESSOPDVSANG");
   }

   public void setAcessoPdvSang(String acessoPdvSang) {
        markAsChanged("ACESSOPDVSANG", acessoPdvSang);
   }

   public String getAcessoPdvSangPdesp() {
        return this.getVo().asString("ACESSOPDVSANGPDESP");
   }

   public void setAcessoPdvSangPdesp(String acessoPdvSangPdesp) {
        markAsChanged("ACESSOPDVSANGPDESP", acessoPdvSangPdesp);
   }

   public String getAcessoPdvSupr() {
        return this.getVo().asString("ACESSOPDVSUPR");
   }

   public void setAcessoPdvSupr(String acessoPdvSupr) {
        markAsChanged("ACESSOPDVSUPR", acessoPdvSupr);
   }

   public String getTokenCheckout() {
        return this.getVo().asString("TOKENCHECKOUT");
   }

   public void setTokenCheckout(String tokenCheckout) {
        markAsChanged("TOKENCHECKOUT", tokenCheckout);
   }

   public String getAccountEmail() {
        return this.getVo().asString("ACCOUNTEMAIL");
   }

   public void setAccountEmail(String accountEmail) {
        markAsChanged("ACCOUNTEMAIL", accountEmail);
   }

   public String getAtNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
   }

   public Timestamp getAccountDhExpira() {
        return this.getVo().asTimestamp("ACCOUNTDHEXPIRA");
   }

   public void setAccountDhExpira(Timestamp accountDhExpira) {
        markAsChanged("ACCOUNTDHEXPIRA", accountDhExpira);
   }

   public String getAccountId() {
        return this.getVo().asString("ACCOUNTID");
   }

   public void setAccountId(String accountId) {
        markAsChanged("ACCOUNTID", accountId);
   }

   public String getAccountNomeFoto() {
        return this.getVo().asString("ACCOUNTNOMEFOTO");
   }

   public void setAccountNomeFoto(String accountNomeFoto) {
        markAsChanged("ACCOUNTNOMEFOTO", accountNomeFoto);
   }

   public char[] getAccountToken() {
        return this.getVo().asClob("ACCOUNTTOKEN");
   }

   public void setAccountToken(char[] accountToken) {
        markAsChanged("ACCOUNTTOKEN", accountToken);
   }

   public String getImp2SansUpcai() {
        return this.getVo().asString("IMP2SANSUPCAI");
   }

   public void setImp2SansUpcai(String imp2SansUpcai) {
        markAsChanged("IMP2SANSUPCAI", imp2SansUpcai);
   }

   public String getDescTotalNotaPdv() {
        return this.getVo().asString("DESCTOTALNOTAPDV");
   }

   public void setDescTotalNotaPdv(String descTotalNotaPdv) {
        markAsChanged("DESCTOTALNOTAPDV", descTotalNotaPdv);
   }

   @Override
   public String getTableName() {
        return "TSIUSU";
   }

   @Override
   public String getEntityName() {
        return "Usuario";
   }

   @Override
   public Usuario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
