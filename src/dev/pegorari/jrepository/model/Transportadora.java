package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Transportadora extends AbstractSankhyaEntity<Transportadora> {
   public String getIdentInscEstad() {
        return this.getVo().asString("IDENTINSCESTAD");
   }

   public void setIdentInscEstad(String identInscEstad) {
        markAsChanged("IDENTINSCESTAD", identInscEstad);
   }

   public String getImplAudLote() {
        return this.getVo().asString("IMPLAUDOLOTE");
   }

   public void setImplAudLote(String implAudLote) {
        markAsChanged("IMPLAUDOLOTE", implAudLote);
   }

   public String getIndNatRet() {
        return this.getVo().asString("INDNATRET");
   }

   public void setIndNatRet(String indNatRet) {
        markAsChanged("INDNATRET", indNatRet);
   }

   public String getInscEstadNauf() {
        return this.getVo().asString("INSCESTADNAUF");
   }

   public void setInscEstadNauf(String inscEstadNauf) {
        markAsChanged("INSCESTADNAUF", inscEstadNauf);
   }

   public String getAgencia() {
        return this.getVo().asString("AGENCIA");
   }

   public void setAgencia(String agencia) {
        markAsChanged("AGENCIA", agencia);
   }

   public String getAgronomo() {
        return this.getVo().asString("AGRONOMO");
   }

   public void setAgronomo(String agronomo) {
        markAsChanged("AGRONOMO", agronomo);
   }

   public String getAgrupar() {
        return this.getVo().asString("AGRUPAR");
   }

   public void setAgrupar(String agrupar) {
        markAsChanged("AGRUPAR", agrupar);
   }

   public BigDecimal getAliqIssRetSimples() {
        return this.getVo().asBigDecimal("ALIQISSRETSIMPLES");
   }

   public void setAliqIssRetSimples(BigDecimal aliqIssRetSimples) {
        markAsChanged("ALIQISSRETSIMPLES", aliqIssRetSimples);
   }

   public String getAluno() {
        return this.getVo().asString("ALUNO");
   }

   public void setAluno(String aluno) {
        markAsChanged("ALUNO", aluno);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getBloquear() {
        return this.getVo().asString("BLOQUEAR");
   }

   public void setBloquear(String bloquear) {
        markAsChanged("BLOQUEAR", bloquear);
   }

   public String getCaixaPostal() {
        return this.getVo().asString("CAIXAPOSTAL");
   }

   public void setCaixaPostal(String caixaPostal) {
        markAsChanged("CAIXAPOSTAL", caixaPostal);
   }

   public String getCalcInss() {
        return this.getVo().asString("CALCINSS");
   }

   public void setCalcInss(String calcInss) {
        markAsChanged("CALCINSS", calcInss);
   }

   public String getCei() {
        return this.getVo().asString("CEI");
   }

   public void setCei(String cei) {
        markAsChanged("CEI", cei);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCgcCpf() {
        return this.getVo().asString("CGC_CPF");
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   public String getClassificMs() {
        return this.getVo().asString("CLASSIFICMS");
   }

   public void setClassificMs(String classificMs) {
        markAsChanged("CLASSIFICMS", classificMs);
   }

   public String getCliente() {
        return this.getVo().asString("CLIENTE");
   }

   public void setCliente(String cliente) {
        markAsChanged("CLIENTE", cliente);
   }

   public String getCodAge() {
        return this.getVo().asString("CODAGE");
   }

   public void setCodAge(String codAge) {
        markAsChanged("CODAGE", codAge);
   }

   public BigDecimal getCodAnt() {
        return this.getVo().asBigDecimal("CODANT");
   }

   public void setCodAnt(BigDecimal codAnt) {
        markAsChanged("CODANT", codAnt);
   }

   public BigDecimal getCodAssessor() {
        return this.getVo().asBigDecimal("CODASSESSOR");
   }

   public void setCodAssessor(BigDecimal codAssessor) {
        markAsChanged("CODASSESSOR", codAssessor);
   }

   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodCred() {
        return this.getVo().asBigDecimal("CODCRED");
   }

   public void setCodCred(BigDecimal codCred) {
        markAsChanged("CODCRED", codCred);
   }

   public String getCodCtaBco() {
        return this.getVo().asString("CODCTABCO");
   }

   public void setCodCtaBco(String codCtaBco) {
        markAsChanged("CODCTABCO", codCtaBco);
   }

   public BigDecimal getCodCtaBcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public BigDecimal getCodCtaCtb2() {
        return this.getVo().asBigDecimal("CODCTACTB2");
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB2", codCtaCtb2);
   }

   public BigDecimal getCodCtaCtb3() {
        return this.getVo().asBigDecimal("CODCTACTB3");
   }

   public void setCodCtaCtb3(BigDecimal codCtaCtb3) {
        markAsChanged("CODCTACTB3", codCtaCtb3);
   }

   public BigDecimal getCodCtaCtb4() {
        return this.getVo().asBigDecimal("CODCTACTB4");
   }

   public void setCodCtaCtb4(BigDecimal codCtaCtb4) {
        markAsChanged("CODCTACTB4", codCtaCtb4);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpPref() {
        return this.getVo().asBigDecimal("CODEMPPREF");
   }

   public void setCodEmpPref(BigDecimal codEmpPref) {
        markAsChanged("CODEMPPREF", codEmpPref);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodLocalPadrao() {
        return this.getVo().asBigDecimal("CODLOCALPADRAO");
   }

   public void setCodLocalPadrao(BigDecimal codLocalPadrao) {
        markAsChanged("CODLOCALPADRAO", codLocalPadrao);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcMatriz() {
        return this.getVo().asBigDecimal("CODPARCMATRIZ");
   }

   public void setCodParcMatriz(BigDecimal codParcMatriz) {
        markAsChanged("CODPARCMATRIZ", codParcMatriz);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodRota() {
        return this.getVo().asBigDecimal("CODROTA");
   }

   public void setCodRota(BigDecimal codRota) {
        markAsChanged("CODROTA", codRota);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTabSt() {
        return this.getVo().asBigDecimal("CODTABST");
   }

   public void setCodTabSt(BigDecimal codTabSt) {
        markAsChanged("CODTABST", codTabSt);
   }

   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public String getCodUniMed() {
        return this.getVo().asString("CODUNIMED");
   }

   public void setCodUniMed(String codUniMed) {
        markAsChanged("CODUNIMED", codUniMed);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuCobr() {
        return this.getVo().asBigDecimal("CODUSUCOBR");
   }

   public void setCodUsuCobr(BigDecimal codUsuCobr) {
        markAsChanged("CODUSUCOBR", codUsuCobr);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public String getContAcesso() {
        return this.getVo().asString("CONTACESSO");
   }

   public void setContAcesso(String contAcesso) {
        markAsChanged("CONTACESSO", contAcesso);
   }

   public BigDecimal getCsTipEnt() {
        return this.getVo().asBigDecimal("CSTIPIENT");
   }

   public void setCsTipEnt(BigDecimal csTipEnt) {
        markAsChanged("CSTIPIENT", csTipEnt);
   }

   public BigDecimal getCsTipIsai() {
        return this.getVo().asBigDecimal("CSTIPISAI");
   }

   public void setCsTipIsai(BigDecimal csTipIsai) {
        markAsChanged("CSTIPISAI", csTipIsai);
   }

   public String getCtaAdiant() {
        return this.getVo().asString("CTAADIANT");
   }

   public void setCtaAdiant(String ctaAdiant) {
        markAsChanged("CTAADIANT", ctaAdiant);
   }

   public String getDescBonif() {
        return this.getVo().asString("DESCBONIF");
   }

   public void setDescBonif(String descBonif) {
        markAsChanged("DESCBONIF", descBonif);
   }

   public BigDecimal getDescFin() {
        return this.getVo().asBigDecimal("DESCFIN");
   }

   public void setDescFin(BigDecimal descFin) {
        markAsChanged("DESCFIN", descFin);
   }

   public String getDescRota() {
        return this.getVo().asString("DESCRROTA");
   }

   public void setDescRota(String descRota) {
        markAsChanged("DESCRROTA", descRota);
   }

   public String getDescStIva() {
        return this.getVo().asString("DESCSTIVA");
   }

   public void setDescStIva(String descStIva) {
        markAsChanged("DESCSTIVA", descStIva);
   }

   public BigDecimal getDiaSem() {
        return this.getVo().asBigDecimal("DIASEM");
   }

   public void setDiaSem(BigDecimal diaSem) {
        markAsChanged("DIASEM", diaSem);
   }

   public BigDecimal getDiasVarPagto() {
        return this.getVo().asBigDecimal("DIASVARPAGTO");
   }

   public void setDiasVarPagto(BigDecimal diasVarPagto) {
        markAsChanged("DIASVARPAGTO", diasVarPagto);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtCad() {
        return this.getVo().asTimestamp("DTCAD");
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
   }

   public Timestamp getDtNasc() {
        return this.getVo().asTimestamp("DTNASC");
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
   }

   public Timestamp getDtUltContato() {
        return this.getVo().asTimestamp("DTULTCONTATO");
   }

   public void setDtUltContato(Timestamp dtUltContato) {
        markAsChanged("DTULTCONTATO", dtUltContato);
   }

   public Timestamp getDtUltNegoc() {
        return this.getVo().asTimestamp("DTULTNEGOC");
   }

   public void setDtUltNegoc(Timestamp dtUltNegoc) {
        markAsChanged("DTULTNEGOC", dtUltNegoc);
   }

   public Timestamp getDhCadSefaz() {
        return this.getVo().asTimestamp("DHCADSEFAZ");
   }

   public void setDhCadSefaz(Timestamp dhCadSefaz) {
        markAsChanged("DHCADSEFAZ", dhCadSefaz);
   }

   public String getEVenda() {
        return this.getVo().asString("EVENDA");
   }

   public void setEVenda(String eVenda) {
        markAsChanged("EVENDA", eVenda);
   }

   public String getFax() {
        return this.getVo().asString("FAX");
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
   }

   public String getEmailDanfe() {
        return this.getVo().asString("EMAILDANFE");
   }

   public void setEmailDanfe(String emailDanfe) {
        markAsChanged("EMAILDANFE", emailDanfe);
   }

   public String getEmailNfe() {
        return this.getVo().asString("EMAILNFE");
   }

   public void setEmailNfe(String emailNfe) {
        markAsChanged("EMAILNFE", emailNfe);
   }

   public String getEntregaEndContato() {
        return this.getVo().asString("ENTREGAENDCONTATO");
   }

   public void setEntregaEndContato(String entregaEndContato) {
        markAsChanged("ENTREGAENDCONTATO", entregaEndContato);
   }

   public String getFlex() {
        return this.getVo().asString("FLEX");
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
   }

   public String getFornecedor() {
        return this.getVo().asString("FORNECEDOR");
   }

   public void setFornecedor(String fornecedor) {
        markAsChanged("FORNECEDOR", fornecedor);
   }

   public String getGrupoAutor() {
        return this.getVo().asString("GRUPOAUTOR");
   }

   public void setGrupoAutor(String grupoAutor) {
        markAsChanged("GRUPOAUTOR", grupoAutor);
   }

   public String getHomePage() {
        return this.getVo().asString("HOMEPAGE");
   }

   public void setHomePage(String homePage) {
        markAsChanged("HOMEPAGE", homePage);
   }

   public String getECompra() {
        return this.getVo().asString("ECOMPRA");
   }

   public void setECompra(String eCompra) {
        markAsChanged("ECOMPRA", eCompra);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getCodEnqIpIsai() {
        return this.getVo().asBigDecimal("CODENQIPISAI");
   }

   public void setCodEnqIpIsai(BigDecimal codEnqIpIsai) {
        markAsChanged("CODENQIPISAI", codEnqIpIsai);
   }

   public BigDecimal getCodEnqIpIent() {
        return this.getVo().asBigDecimal("CODENQIPIENT");
   }

   public void setCodEnqIpIent(BigDecimal codEnqIpIent) {
        markAsChanged("CODENQIPIENT", codEnqIpIent);
   }

   public String getIdEstrangeiro() {
        return this.getVo().asString("IDESTRANGEIRO");
   }

   public void setIdEstrangeiro(String idEstrangeiro) {
        markAsChanged("IDESTRANGEIRO", idEstrangeiro);
   }

   public String getTipGerBolCent() {
        return this.getVo().asString("TIPGERBOLCENT");
   }

   public void setTipGerBolCent(String tipGerBolCent) {
        markAsChanged("TIPGERBOLCENT", tipGerBolCent);
   }

   public String getComoConheceu() {
        return this.getVo().asString("COMOCONHECEU");
   }

   public void setComoConheceu(String comoConheceu) {
        markAsChanged("COMOCONHECEU", comoConheceu);
   }

   public BigDecimal getSitCadSefaz() {
        return this.getVo().asBigDecimal("SITCADSEFAZ");
   }

   public void setSitCadSefaz(BigDecimal sitCadSefaz) {
        markAsChanged("SITCADSEFAZ", sitCadSefaz);
   }

   public String getTimProprieta() {
        return this.getVo().asString("TIMPROPRIETA");
   }

   public void setTimProprieta(String timProprieta) {
        markAsChanged("TIMPROPRIETA", timProprieta);
   }

   public String getTimPropVenda() {
        return this.getVo().asString("TIMPROPVENDA");
   }

   public void setTimPropVenda(String timPropVenda) {
        markAsChanged("TIMPROPVENDA", timPropVenda);
   }

   public String getTimQuerComprar() {
        return this.getVo().asString("TIMQUERCOMPRAR");
   }

   public void setTimQuerComprar(String timQuerComprar) {
        markAsChanged("TIMQUERCOMPRAR", timQuerComprar);
   }

   public String getTimReferencia01() {
        return this.getVo().asString("TIMREFERENCIA01");
   }

   public void setTimReferencia01(String timReferencia01) {
        markAsChanged("TIMREFERENCIA01", timReferencia01);
   }

   public String getTimReferencia02() {
        return this.getVo().asString("TIMREFERENCIA02");
   }

   public void setTimReferencia02(String timReferencia02) {
        markAsChanged("TIMREFERENCIA02", timReferencia02);
   }

   public String getTimSenhaDesc() {
        return this.getVo().asString("TIMSENHADESC");
   }

   public void setTimSenhaDesc(String timSenhaDesc) {
        markAsChanged("TIMSENHADESC", timSenhaDesc);
   }

   public String getTimSenhaSite() {
        return this.getVo().asString("TIMSENHASITE");
   }

   public void setTimSenhaSite(String timSenhaSite) {
        markAsChanged("TIMSENHASITE", timSenhaSite);
   }

   public String getTimTelefone01() {
        return this.getVo().asString("TIMTELEFONE01");
   }

   public void setTimTelefone01(String timTelefone01) {
        markAsChanged("TIMTELEFONE01", timTelefone01);
   }

   public String getTimTelefone02() {
        return this.getVo().asString("TIMTELEFONE02");
   }

   public void setTimTelefone02(String timTelefone02) {
        markAsChanged("TIMTELEFONE02", timTelefone02);
   }

   public String getTimTipoMoradia() {
        return this.getVo().asString("TIMTIPOMORADIA");
   }

   public void setTimTipoMoradia(String timTipoMoradia) {
        markAsChanged("TIMTIPOMORADIA", timTipoMoradia);
   }

   public String getTruncParcela() {
        return this.getVo().asString("TRUNCPARCELA");
   }

   public void setTruncParcela(String truncParcela) {
        markAsChanged("TRUNCPARCELA", truncParcela);
   }

   public String getVlrLiqItemNfce() {
        return this.getVo().asString("VLRLIQITEMNFCE");
   }

   public void setVlrLiqItemNfce(String vlrLiqItemNfce) {
        markAsChanged("VLRLIQITEMNFCE", vlrLiqItemNfce);
   }

   public String getVlrLiqItemNfe() {
        return this.getVo().asString("VLRLIQITEMNFE");
   }

   public void setVlrLiqItemNfe(String vlrLiqItemNfe) {
        markAsChanged("VLRLIQITEMNFE", vlrLiqItemNfe);
   }

   public String getEnviaDanfeRedespacho() {
        return this.getVo().asString("ENVIADANFEREDESPACHO");
   }

   public void setEnviaDanfeRedespacho(String enviaDanfeRedespacho) {
        markAsChanged("ENVIADANFEREDESPACHO", enviaDanfeRedespacho);
   }

   public String getExigContatoEntCab() {
        return this.getVo().asString("EXIGCONTATOENTCAB");
   }

   public void setExigContatoEntCab(String exigContatoEntCab) {
        markAsChanged("EXIGCONTATOENTCAB", exigContatoEntCab);
   }

   public String getParcSubstIss() {
        return this.getVo().asString("PARCSUBSTISS");
   }

   public void setParcSubstIss(String parcSubstIss) {
        markAsChanged("PARCSUBSTISS", parcSubstIss);
   }

   public String getArredPrimeiraParc() {
        return this.getVo().asString("ARREDPRIMEIRAPARC");
   }

   public void setArredPrimeiraParc(String arredPrimeiraParc) {
        markAsChanged("ARREDPRIMEIRAPARC", arredPrimeiraParc);
   }

   public String getAssociacaoDesp() {
        return this.getVo().asString("ASSOCIACAODESP");
   }

   public void setAssociacaoDesp(String associacaoDesp) {
        markAsChanged("ASSOCIACAODESP", associacaoDesp);
   }

   public String getCnae() {
        return this.getVo().asString("CNAE");
   }

   public void setCnae(String cnae) {
        markAsChanged("CNAE", cnae);
   }

   public BigDecimal getCodContatoPadCot() {
        return this.getVo().asBigDecimal("CODCONTATOPADCOT");
   }

   public void setCodContatoPadCot(BigDecimal codContatoPadCot) {
        markAsChanged("CODCONTATOPADCOT", codContatoPadCot);
   }

   public BigDecimal getCodGrupo() {
        return this.getVo().asBigDecimal("CODGRUPO");
   }

   public void setCodGrupo(BigDecimal codGrupo) {
        markAsChanged("CODGRUPO", codGrupo);
   }

   public BigDecimal getCodParcGruEconomico() {
        return this.getVo().asBigDecimal("CODPARCGRUECONOMICO");
   }

   public void setCodParcGruEconomico(BigDecimal codParcGruEconomico) {
        markAsChanged("CODPARCGRUECONOMICO", codParcGruEconomico);
   }

   public String getCpfProdRural() {
        return this.getVo().asString("CPFPRODRURAL");
   }

   public void setCpfProdRural(String cpfProdRural) {
        markAsChanged("CPFPRODRURAL", cpfProdRural);
   }

   public Timestamp getDhCadRf() {
        return this.getVo().asTimestamp("DHCADRF");
   }

   public void setDhCadRf(Timestamp dhCadRf) {
        markAsChanged("DHCADRF", dhCadRf);
   }

   public Timestamp getDtBaixa() {
        return this.getVo().asTimestamp("DTBAIXA");
   }

   public void setDtBaixa(Timestamp dtBaixa) {
        markAsChanged("DTBAIXA", dtBaixa);
   }

   public Timestamp getDtIniAtiv() {
        return this.getVo().asTimestamp("DTINIATIV");
   }

   public void setDtIniAtiv(Timestamp dtIniAtiv) {
        markAsChanged("DTINIATIV", dtIniAtiv);
   }

   public Timestamp getDtUltSit() {
        return this.getVo().asTimestamp("DTULTSIT");
   }

   public void setDtUltSit(Timestamp dtUltSit) {
        markAsChanged("DTULTSIT", dtUltSit);
   }

   public String getEmailNfse() {
        return this.getVo().asString("EMAILNFSE");
   }

   public void setEmailNfse(String emailNfse) {
        markAsChanged("EMAILNFSE", emailNfse);
   }

   public String getEnqArt227() {
        return this.getVo().asString("ENQART227");
   }

   public void setEnqArt227(String enqArt227) {
        markAsChanged("ENQART227", enqArt227);
   }

   public BigDecimal getIndCredCte() {
        return this.getVo().asBigDecimal("INDCREDCTE");
   }

   public void setIndCredCte(BigDecimal indCredCte) {
        markAsChanged("INDCREDCTE", indCredCte);
   }

   public BigDecimal getIndCredNfe() {
        return this.getVo().asBigDecimal("INDCREDNFE");
   }

   public void setIndCredNfe(BigDecimal indCredNfe) {
        markAsChanged("INDCREDNFE", indCredNfe);
   }

   public BigDecimal getIndOpCcp() {
        return this.getVo().asBigDecimal("INDOPCCP");
   }

   public void setIndOpCcp(BigDecimal indOpCcp) {
        markAsChanged("INDOPCCP", indOpCcp);
   }

   public BigDecimal getModeloNotaCompra() {
        return this.getVo().asBigDecimal("MODELONOTACOMPRA");
   }

   public void setModeloNotaCompra(BigDecimal modeloNotaCompra) {
        markAsChanged("MODELONOTACOMPRA", modeloNotaCompra);
   }

   public BigDecimal getNuFop() {
        return this.getVo().asBigDecimal("NUFOP");
   }

   public void setNuFop(BigDecimal nuFop) {
        markAsChanged("NUFOP", nuFop);
   }

   public String getOrgPublNfse() {
        return this.getVo().asString("ORGPUBLNFSE");
   }

   public void setOrgPublNfse(String orgPublNfse) {
        markAsChanged("ORGPUBLNFSE", orgPublNfse);
   }

   public String getParcInter() {
        return this.getVo().asString("PARCINTER");
   }

   public void setParcInter(String parcInter) {
        markAsChanged("PARCINTER", parcInter);
   }

   public String getRegApur() {
        return this.getVo().asString("REGAPUR");
   }

   public void setRegApur(String regApur) {
        markAsChanged("REGAPUR", regApur);
   }

   public BigDecimal getSitCadRf() {
        return this.getVo().asBigDecimal("SITCADRF");
   }

   public void setSitCadRf(BigDecimal sitCadRf) {
        markAsChanged("SITCADRF", sitCadRf);
   }

   public BigDecimal getTimAInvestir() {
        return this.getVo().asBigDecimal("TIMAINVESTIR");
   }

   public void setTimAInvestir(BigDecimal timAInvestir) {
        markAsChanged("TIMAINVESTIR", timAInvestir);
   }

   public BigDecimal getTimBairroCompra() {
        return this.getVo().asBigDecimal("TIMBAIRROCOMPRA");
   }

   public void setTimBairroCompra(BigDecimal timBairroCompra) {
        markAsChanged("TIMBAIRROCOMPRA", timBairroCompra);
   }

   public BigDecimal getTimCartorio() {
        return this.getVo().asBigDecimal("TIMCARTORIO");
   }

   public void setTimCartorio(BigDecimal timCartorio) {
        markAsChanged("TIMCARTORIO", timCartorio);
   }

   public String getTimCartRegimeBensV() {
        return this.getVo().asString("TIMCARTREGIMEBENSV");
   }

   public void setTimCartRegimeBensV(String timCartRegimeBensV) {
        markAsChanged("TIMCARTREGIMEBENSV", timCartRegimeBensV);
   }

   public String getTimComprador() {
        return this.getVo().asString("TIMCOMPRADOR");
   }

   public void setTimComprador(String timComprador) {
        markAsChanged("TIMCOMPRADOR", timComprador);
   }

   public String getTimCorrespBancario() {
        return this.getVo().asString("TIMCORRESPBANCARIO");
   }

   public void setTimCorrespBancario(String timCorrespBancario) {
        markAsChanged("TIMCORRESPBANCARIO", timCorrespBancario);
   }

   public String getTimCorretor() {
        return this.getVo().asString("TIMCORRETOR");
   }

   public void setTimCorretor(String timCorretor) {
        markAsChanged("TIMCORRETOR", timCorretor);
   }

   public Timestamp getTimDataCi() {
        return this.getVo().asTimestamp("TIMDATACI");
   }

   public void setTimDataCi(Timestamp timDataCi) {
        markAsChanged("TIMDATACI", timDataCi);
   }

   public String getTimEstadoCivil() {
        return this.getVo().asString("TIMESTADOCIVIL");
   }

   public void setTimEstadoCivil(String timEstadoCivil) {
        markAsChanged("TIMESTADOCIVIL", timEstadoCivil);
   }

   public String getTimFaixaSalarial() {
        return this.getVo().asString("TIMFAIXASALARIAL");
   }

   public void setTimFaixaSalarial(String timFaixaSalarial) {
        markAsChanged("TIMFAIXASALARIAL", timFaixaSalarial);
   }

   public String getTimFiador() {
        return this.getVo().asString("TIMFIADOR");
   }

   public void setTimFiador(String timFiador) {
        markAsChanged("TIMFIADOR", timFiador);
   }

   public String getTimInquilino() {
        return this.getVo().asString("TIMINQUILINO");
   }

   public void setTimInquilino(String timInquilino) {
        markAsChanged("TIMINQUILINO", timInquilino);
   }

   public String getTimMae() {
        return this.getVo().asString("TIMMAE");
   }

   public void setTimMae(String timMae) {
        markAsChanged("TIMMAE", timMae);
   }

   public BigDecimal getTimNacionalidad() {
        return this.getVo().asBigDecimal("TIMNACIONALIDAD");
   }

   public void setTimNacionalidad(BigDecimal timNacionalidad) {
        markAsChanged("TIMNACIONALIDAD", timNacionalidad);
   }

   public String getTimOrgao() {
        return this.getVo().asString("TIMORGAO");
   }

   public void setTimOrgao(String timOrgao) {
        markAsChanged("TIMORGAO", timOrgao);
   }

   public String getTimOutTels() {
        return this.getVo().asString("TIMOUTTELS");
   }

   public void setTimOutTels(String timOutTels) {
        markAsChanged("TIMOUTTELS", timOutTels);
   }

   public String getTimPai() {
        return this.getVo().asString("TIMPAI");
   }

   public void setTimPai(String timPai) {
        markAsChanged("TIMPAI", timPai);
   }

   public BigDecimal getTimProfissao() {
        return this.getVo().asBigDecimal("TIMPROFISSAO");
   }

   public void setTimProfissao(BigDecimal timProfissao) {
        markAsChanged("TIMPROFISSAO", timProfissao);
   }

   public String getCalcFetHab() {
        return this.getVo().asString("CALCFETHAB");
   }

   public void setCalcFetHab(String calcFetHab) {
        markAsChanged("CALCFETHAB", calcFetHab);
   }

   public String getAplicLeiTransp() {
        return this.getVo().asString("APLICLEITRANSP");
   }

   public void setAplicLeiTransp(String aplicLeiTransp) {
        markAsChanged("APLICLEITRANSP", aplicLeiTransp);
   }

   public String getEmailNotifEntrega() {
        return this.getVo().asString("EMAILNOTIFENTREGA");
   }

   public void setEmailNotifEntrega(String emailNotifEntrega) {
        markAsChanged("EMAILNOTIFENTREGA", emailNotifEntrega);
   }

   public String getImpAgrupFin() {
        return this.getVo().asString("IMPAGRUPFIN");
   }

   public void setImpAgrupFin(String impAgrupFin) {
        markAsChanged("IMPAGRUPFIN", impAgrupFin);
   }

   public String getIndAquisicao() {
        return this.getVo().asString("INDAQUISICAO");
   }

   public void setIndAquisicao(String indAquisicao) {
        markAsChanged("INDAQUISICAO", indAquisicao);
   }

   public String getIndComercializacao() {
        return this.getVo().asString("INDCOMERCIALIZACAO");
   }

   public void setIndComercializacao(String indComercializacao) {
        markAsChanged("INDCOMERCIALIZACAO", indComercializacao);
   }

   public BigDecimal getUniImport() {
        return this.getVo().asBigDecimal("UNIDIMPORT");
   }

   public void setUniImport(BigDecimal uniImport) {
        markAsChanged("UNIDIMPORT", uniImport);
   }

   public String getInscMun() {
        return this.getVo().asString("INSCMUN");
   }

   public void setInscMun(String inscMun) {
        markAsChanged("INSCMUN", inscMun);
   }

   public String getIpiIncIcms() {
        return this.getVo().asString("IPIINCICMS");
   }

   public void setIpiIncIcms(String ipiIncIcms) {
        markAsChanged("IPIINCICMS", ipiIncIcms);
   }

   public String getLatitude() {
        return this.getVo().asString("LATITUDE");
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
   }

   public BigDecimal getLimCred() {
        return this.getVo().asBigDecimal("LIMCRED");
   }

   public void setLimCred(BigDecimal limCred) {
        markAsChanged("LIMCRED", limCred);
   }

   public BigDecimal getLimCredMensal() {
        return this.getVo().asBigDecimal("LIMCREDMENSAL");
   }

   public void setLimCredMensal(BigDecimal limCredMensal) {
        markAsChanged("LIMCREDMENSAL", limCredMensal);
   }

   public String getLongitude() {
        return this.getVo().asString("LONGITUDE");
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
   }

   public String getMedico() {
        return this.getVo().asString("MEDICO");
   }

   public void setMedico(String medico) {
        markAsChanged("MEDICO", medico);
   }

   public String getMeiRj() {
        return this.getVo().asString("MEIRJ");
   }

   public void setMeiRj(String meiRj) {
        markAsChanged("MEIRJ", meiRj);
   }

   public String getModeloNfDes() {
        return this.getVo().asString("MODELONFDES");
   }

   public void setModeloNfDes(String modeloNfDes) {
        markAsChanged("MODELONFDES", modeloNfDes);
   }

   public String getMotBloq() {
        return this.getVo().asString("MOTBLOQ");
   }

   public void setMotBloq(String motBloq) {
        markAsChanged("MOTBLOQ", motBloq);
   }

   public String getMotorista() {
        return this.getVo().asString("MOTORISTA");
   }

   public void setMotorista(String motorista) {
        markAsChanged("MOTORISTA", motorista);
   }

   public String getNaturezaOperDes() {
        return this.getVo().asString("NATUREZAOPERDES");
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
   }

   public String getNomeAge() {
        return this.getVo().asString("NOMEAGE");
   }

   public void setNomeAge(String nomeAge) {
        markAsChanged("NOMEAGE", nomeAge);
   }

   public String getNomeParc() {
        return this.getVo().asString("NOMEPARC");
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getObservacoes() {
        return this.getVo().asString("OBSERVACOES");
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
   }

   public String getOperLogist() {
        return this.getVo().asString("OPERLOGIST");
   }

   public void setOperLogist(String operLogist) {
        markAsChanged("OPERLOGIST", operLogist);
   }

   public BigDecimal getPercCusVar() {
        return this.getVo().asBigDecimal("PERCCUSVAR");
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
   }

   public BigDecimal getPercDescEspecial() {
        return this.getVo().asBigDecimal("PERCDESCESPECIAL");
   }

   public void setPercDescEspecial(BigDecimal percDescEspecial) {
        markAsChanged("PERCDESCESPECIAL", percDescEspecial);
   }

   public BigDecimal getPercJuro() {
        return this.getVo().asBigDecimal("PERCJURO");
   }

   public void setPercJuro(BigDecimal percJuro) {
        markAsChanged("PERCJURO", percJuro);
   }

   public BigDecimal getPercMulta() {
        return this.getVo().asBigDecimal("PERCMULTA");
   }

   public void setPercMulta(BigDecimal percMulta) {
        markAsChanged("PERCMULTA", percMulta);
   }

   public BigDecimal getPotencialNeg() {
        return this.getVo().asBigDecimal("POTENCIALNEG");
   }

   public void setPotencialNeg(BigDecimal potencialNeg) {
        markAsChanged("POTENCIALNEG", potencialNeg);
   }

   public BigDecimal getPrazoContato() {
        return this.getVo().asBigDecimal("PRAZOCONTATO");
   }

   public void setPrazoContato(BigDecimal prazoContato) {
        markAsChanged("PRAZOCONTATO", prazoContato);
   }

   public BigDecimal getPrazoPag() {
        return this.getVo().asBigDecimal("PRAZOPAG");
   }

   public void setPrazoPag(BigDecimal prazoPag) {
        markAsChanged("PRAZOPAG", prazoPag);
   }

   public String getProdutorTemNf() {
        return this.getVo().asString("PRODUTORTEMNF");
   }

   public void setProdutorTemNf(String produtorTemNf) {
        markAsChanged("PRODUTORTEMNF", produtorTemNf);
   }

   public String getProfessor() {
        return this.getVo().asString("PROFESSOR");
   }

   public void setProfessor(String professor) {
        markAsChanged("PROFESSOR", professor);
   }

   public BigDecimal getQtdMaxPedCpa() {
        return this.getVo().asBigDecimal("QTDMAXPEDCPA");
   }

   public void setQtdMaxPedCpa(BigDecimal qtdMaxPedCpa) {
        markAsChanged("QTDMAXPEDCPA", qtdMaxPedCpa);
   }

   public BigDecimal getQtdMaxTitVencidos() {
        return this.getVo().asBigDecimal("QTDMAXTITVENCIDOS");
   }

   public void setQtdMaxTitVencidos(BigDecimal qtdMaxTitVencidos) {
        markAsChanged("QTDMAXTITVENCIDOS", qtdMaxTitVencidos);
   }

   public BigDecimal getRamal() {
        return this.getVo().asBigDecimal("RAMAL");
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
   }

   public String getRazaoSocial() {
        return this.getVo().asString("RAZAOSOCIAL");
   }

   public void setRazaoSocial(String razaoSocial) {
        markAsChanged("RAZAOSOCIAL", razaoSocial);
   }

   public String getRetemCofins() {
        return this.getVo().asString("RETEMCOFINS");
   }

   public void setRetemCofins(String retemCofins) {
        markAsChanged("RETEMCOFINS", retemCofins);
   }

   public String getRetemCsl() {
        return this.getVo().asString("RETEMCSL");
   }

   public void setRetemCsl(String retemCsl) {
        markAsChanged("RETEMCSL", retemCsl);
   }

   public String getRetemInss() {
        return this.getVo().asString("RETEMINSS");
   }

   public void setRetemInss(String retemInss) {
        markAsChanged("RETEMINSS", retemInss);
   }

   public String getRetemIss() {
        return this.getVo().asString("RETEMISS");
   }

   public void setRetemIss(String retemIss) {
        markAsChanged("RETEMISS", retemIss);
   }

   public String getRetemPis() {
        return this.getVo().asString("RETEMPIS");
   }

   public void setRetemPis(String retemPis) {
        markAsChanged("RETEMPIS", retemPis);
   }

   public String getRetStVenda() {
        return this.getVo().asString("RETSTVENDA");
   }

   public void setRetStVenda(String retStVenda) {
        markAsChanged("RETSTVENDA", retStVenda);
   }

   public String getSelecionado() {
        return this.getVo().asString("SELECIONADO");
   }

   public void setSelecionado(String selecionado) {
        markAsChanged("SELECIONADO", selecionado);
   }

   public String getSerieNfDes() {
        return this.getVo().asString("SERIENFDES");
   }

   public void setSerieNfDes(String serieNfDes) {
        markAsChanged("SERIENFDES", serieNfDes);
   }

   public String getSexo() {
        return this.getVo().asString("SEXO");
   }

   public void setSexo(String sexo) {
        markAsChanged("SEXO", sexo);
   }

   public String getSimples() {
        return this.getVo().asString("SIMPLES");
   }

   public void setSimples(String simples) {
        markAsChanged("SIMPLES", simples);
   }

   public String getSitCcf() {
        return this.getVo().asString("SITCCF");
   }

   public void setSitCcf(String sitCcf) {
        markAsChanged("SITCCF", sitCcf);
   }

   public String getSitReceita() {
        return this.getVo().asString("SITRECEITA");
   }

   public void setSitReceita(String sitReceita) {
        markAsChanged("SITRECEITA", sitReceita);
   }

   public String getSitSintegra() {
        return this.getVo().asString("SITSINTEGRA");
   }

   public void setSitSintegra(String sitSintegra) {
        markAsChanged("SITSINTEGRA", sitSintegra);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getStatusEdz() {
        return this.getVo().asString("STATUSEDZ");
   }

   public void setStatusEdz(String statusEdz) {
        markAsChanged("STATUSEDZ", statusEdz);
   }

   public String getTare() {
        return this.getVo().asString("TARE");
   }

   public void setTare(String tare) {
        markAsChanged("TARE", tare);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTemIpi() {
        return this.getVo().asString("TEMIPI");
   }

   public void setTemIpi(String temIpi) {
        markAsChanged("TEMIPI", temIpi);
   }

   public String getTipAnexoNfe() {
        return this.getVo().asString("TIPANEXONFE");
   }

   public void setTipAnexoNfe(String tipAnexoNfe) {
        markAsChanged("TIPANEXONFE", tipAnexoNfe);
   }

   public String getTipJuro() {
        return this.getVo().asString("TIPJURO");
   }

   public void setTipJuro(String tipJuro) {
        markAsChanged("TIPJURO", tipJuro);
   }

   public String getTipoFatur() {
        return this.getVo().asString("TIPOFATUR");
   }

   public void setTipoFatur(String tipoFatur) {
        markAsChanged("TIPOFATUR", tipoFatur);
   }

   public String getTipoGerBoleto() {
        return this.getVo().asString("TIPOGERBOLETO");
   }

   public void setTipoGerBoleto(String tipoGerBoleto) {
        markAsChanged("TIPOGERBOLETO", tipoGerBoleto);
   }

   public String getTipPessoa() {
        return this.getVo().asString("TIPPESSOA");
   }

   public void setTipPessoa(String tipPessoa) {
        markAsChanged("TIPPESSOA", tipPessoa);
   }

   public BigDecimal getTolerInadImp() {
        return this.getVo().asBigDecimal("TOLERINADIMP");
   }

   public void setTolerInadImp(BigDecimal tolerInadImp) {
        markAsChanged("TOLERINADIMP", tolerInadImp);
   }

   public String getTransportadora() {
        return this.getVo().asString("TRANSPORTADORA");
   }

   public void setTransportadora(String transportadora) {
        markAsChanged("TRANSPORTADORA", transportadora);
   }

   public String getUsaTabCrForn() {
        return this.getVo().asString("USATABCRFORN");
   }

   public void setUsaTabCrForn(String usaTabCrForn) {
        markAsChanged("USATABCRFORN", usaTabCrForn);
   }

   public String getUsuario() {
        return this.getVo().asString("USUARIO");
   }

   public void setUsuario(String usuario) {
        markAsChanged("USUARIO", usuario);
   }

   public String getValDescGrdCar() {
        return this.getVo().asString("VALDESCGRDCAR");
   }

   public void setValDescGrdCar(String valDescGrdCar) {
        markAsChanged("VALDESCGRDCAR", valDescGrdCar);
   }

   public String getVendedor() {
        return this.getVo().asString("VENDEDOR");
   }

   public void setVendedor(String vendedor) {
        markAsChanged("VENDEDOR", vendedor);
   }

   public BigDecimal getVlrMinPedCpa() {
        return this.getVo().asBigDecimal("VLRMINPEDCPA");
   }

   public void setVlrMinPedCpa(BigDecimal vlrMinPedCpa) {
        markAsChanged("VLRMINPEDCPA", vlrMinPedCpa);
   }

   public String getTermAcord() {
        return this.getVo().asString("TERMACORD");
   }

   public void setTermAcord(String termAcord) {
        markAsChanged("TERMACORD", termAcord);
   }

   public BigDecimal getIntervAnalisCred() {
        return this.getVo().asBigDecimal("INTERVANALISCRED");
   }

   public void setIntervAnalisCred(BigDecimal intervAnalisCred) {
        markAsChanged("INTERVANALISCRED", intervAnalisCred);
   }

   public BigDecimal getVendaMin() {
        return this.getVo().asBigDecimal("VENDAMIN");
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
   }

   public String getTranspPropria() {
        return this.getVo().asString("TRANSPPROPRIA");
   }

   public void setTranspPropria(String transpPropria) {
        markAsChanged("TRANSPPROPRIA", transpPropria);
   }

   public String getExigeNomeParc() {
        return this.getVo().asString("EXIGENOMEPARC");
   }

   public void setExigeNomeParc(String exigeNomeParc) {
        markAsChanged("EXIGENOMEPARC", exigeNomeParc);
   }

   public String getEstabTransp() {
        return this.getVo().asString("ESTABTRANSP");
   }

   public void setEstabTransp(String estabTransp) {
        markAsChanged("ESTABTRANSP", estabTransp);
   }

   public Timestamp getDtEmisNfeForn() {
        return this.getVo().asTimestamp("DTEMISNFEFORN");
   }

   public void setDtEmisNfeForn(Timestamp dtEmisNfeForn) {
        markAsChanged("DTEMISNFEFORN", dtEmisNfeForn);
   }

   public BigDecimal getPercRedInss() {
        return this.getVo().asBigDecimal("PERCREDINSS");
   }

   public void setPercRedInss(BigDecimal percRedInss) {
        markAsChanged("PERCREDINSS", percRedInss);
   }

   public BigDecimal getDiaPagtoEconect() {
        return this.getVo().asBigDecimal("DIAPAGTOECONECT");
   }

   public void setDiaPagtoEconect(BigDecimal diaPagtoEconect) {
        markAsChanged("DIAPAGTOECONECT", diaPagtoEconect);
   }

   public BigDecimal getDiaFechaEconect() {
        return this.getVo().asBigDecimal("DIAFECHAECONECT");
   }

   public void setDiaFechaEconect(BigDecimal diaFechaEconect) {
        markAsChanged("DIAFECHAECONECT", diaFechaEconect);
   }

   public String getIntegraEconect() {
        return this.getVo().asString("INTEGRAECONECT");
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
   }

   public BigDecimal getBaseParcelEconect() {
        return this.getVo().asBigDecimal("BASEPARCELECONECT");
   }

   public void setBaseParcelEconect(BigDecimal baseParcelEconect) {
        markAsChanged("BASEPARCELECONECT", baseParcelEconect);
   }

   public String getSenhaEconect() {
        return this.getVo().asString("SENHAECONECT");
   }

   public void setSenhaEconect(String senhaEconect) {
        markAsChanged("SENHAECONECT", senhaEconect);
   }

   public String getPrazoParcEconect() {
        return this.getVo().asString("PRAZOPARCECONECT");
   }

   public void setPrazoParcEconect(String prazoParcEconect) {
        markAsChanged("PRAZOPARCECONECT", prazoParcEconect);
   }

   public String getParcelaMEconect() {
        return this.getVo().asString("PARCELAMECONECT");
   }

   public void setParcelaMEconect(String parcelaMEconect) {
        markAsChanged("PARCELAMECONECT", parcelaMEconect);
   }

   public String getPerfilEconect() {
        return this.getVo().asString("PERFILECONECT");
   }

   public void setPerfilEconect(String perfilEconect) {
        markAsChanged("PERFILECONECT", perfilEconect);
   }

   public BigDecimal getBasePrazoEconect() {
        return this.getVo().asBigDecimal("BASEPRAZOECONECT");
   }

   public void setBasePrazoEconect(BigDecimal basePrazoEconect) {
        markAsChanged("BASEPRAZOECONECT", basePrazoEconect);
   }

   public String getTiposParc() {
        return this.getVo().asString("TIPOSPARC");
   }

   public void setTiposParc(String tiposParc) {
        markAsChanged("TIPOSPARC", tiposParc);
   }

   public String getEnviaPedEmailTop() {
        return this.getVo().asString("ENVIPEDEMAILTOP");
   }

   public void setEnviaPedEmailTop(String enviaPedEmailTop) {
        markAsChanged("ENVIPEDEMAILTOP", enviaPedEmailTop);
   }

   public String getMotNaoReterIssQn() {
        return this.getVo().asString("MOTNAORETERISSQN");
   }

   public void setMotNaoReterIssQn(String motNaoReterIssQn) {
        markAsChanged("MOTNAORETERISSQN", motNaoReterIssQn);
   }

   public String getSitEspecialResp() {
        return this.getVo().asString("SITESPECIALRESP");
   }

   public void setSitEspecialResp(String sitEspecialResp) {
        markAsChanged("SITESPECIALRESP", sitEspecialResp);
   }

   public BigDecimal getProvaCresc() {
        return this.getVo().asBigDecimal("PROVACRESC");
   }

   public void setProvaCresc(BigDecimal provaCresc) {
        markAsChanged("PROVACRESC", provaCresc);
   }

   public BigDecimal getSaldoDisp() {
        return this.getVo().asBigDecimal("SALDODISP");
   }

   public void setSaldoDisp(BigDecimal saldoDisp) {
        markAsChanged("SALDODISP", saldoDisp);
   }

   public String getTipLotacao() {
        return this.getVo().asString("TIPLOTACAO");
   }

   public void setTipLotacao(String tipLotacao) {
        markAsChanged("TIPLOTACAO", tipLotacao);
   }

   public String getChavePix() {
        return this.getVo().asString("CHAVEPIX");
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
   }

   public String getDesconsidEscBase() {
        return this.getVo().asString("DESCONSIDESCBASE");
   }

   public void setDesconsidEscBase(String desconsidEscBase) {
        markAsChanged("DESCONSIDESCBASE", desconsidEscBase);
   }

   public BigDecimal getCodIdentCons() {
        return this.getVo().asBigDecimal("CODIDENTCONS");
   }

   public void setCodIdentCons(BigDecimal codIdentCons) {
        markAsChanged("CODIDENTCONS", codIdentCons);
   }

   public BigDecimal getTipClienteServCom() {
        return this.getVo().asBigDecimal("TIPCLIENTESERVCOM");
   }

   public void setTipClienteServCom(BigDecimal tipClienteServCom) {
        markAsChanged("TIPCLIENTESERVCOM", tipClienteServCom);
   }

   public String getUtilizaNucadParc() {
        return this.getVo().asString("UTILIZANUCADPARC");
   }

   public void setUtilizaNucadParc(String utilizaNucadParc) {
        markAsChanged("UTILIZANUCADPARC", utilizaNucadParc);
   }

   public BigDecimal getProvaCrescCac() {
        return this.getVo().asBigDecimal("PROVACRESCCAC");
   }

   public void setProvaCrescCac(BigDecimal provaCrescCac) {
        markAsChanged("PROVACRESCCAC", provaCrescCac);
   }

   public BigDecimal getSaldoDispCac() {
        return this.getVo().asBigDecimal("SALDODISPCAC");
   }

   public void setSaldoDispCac(BigDecimal saldoDispCac) {
        markAsChanged("SALDODISPCAC", saldoDispCac);
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

   public String getConsidTotItensTrib() {
        return this.getVo().asString("CONSIDTOTITENSTRIB");
   }

   public void setConsidTotItensTrib(String considTotItensTrib) {
        markAsChanged("CONSIDTOTITENSTRIB", considTotItensTrib);
   }

   public String getDeduzIpiBcPisCf() {
        return this.getVo().asString("DEDUZIPIBCPISCF");
   }

   public void setDeduzIpiBcPisCf(String deduzIpiBcPisCf) {
        markAsChanged("DEDUZIPIBCPISCF", deduzIpiBcPisCf);
   }

   public String getConsParcAdrCst() {
        return this.getVo().asString("CONSPARCADRCST");
   }

   public void setConsParcAdrCst(String consParcAdrCst) {
        markAsChanged("CONSPARCADRCST", consParcAdrCst);
   }

   public String getDesconsDescInss() {
        return this.getVo().asString("DESCONSDESCINSS");
   }

   public void setDesconsDescInss(String desconsDescInss) {
        markAsChanged("DESCONSDESCINSS", desconsDescInss);
   }

   public String getEmailCte() {
        return this.getVo().asString("EMAILCTE");
   }

   public void setEmailCte(String emailCte) {
        markAsChanged("EMAILCTE", emailCte);
   }

   public String getRede() {
        return this.getVo().asString("REDE");
   }

   public void setRede(String rede) {
        markAsChanged("REDE", rede);
   }

   public BigDecimal getGrupoPisCofins() {
        return this.getVo().asBigDecimal("GRUPOPISCOFINS");
   }

   public void setGrupoPisCofins(BigDecimal grupoPisCofins) {
        markAsChanged("GRUPOPISCOFINS", grupoPisCofins);
   }

   @Override
   public String getTableName() {
        return "TGFPAR";
   }

   @Override
   public String getEntityName() {
        return "Transportadora";
   }

   @Override
   public Transportadora fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
