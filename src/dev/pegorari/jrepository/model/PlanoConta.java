package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoConta extends AbstractSankhyaEntity<PlanoConta> {
   private String analitica;
   private String ativa;
   private String bemOriginal;
   private String bemOutros;
   private String bemResreav;
   private String cencusObrig;
   private BigDecimal codCtaCtbPai;
   private BigDecimal codEmp;
   private String codGrupoCta;
   private String convSaldoMoeda;
   private BigDecimal codCtaCtb;
   private String ctaCtb;
   private String descrCta;
   private String dtBaseConvMoeda;
   private BigDecimal grau;
   private String observacoes;
   private BigDecimal planta;
   private BigDecimal processo;
   private BigDecimal produto;
   private String projObrig;
   private String podeLancToManual;
   private BigDecimal codCtaCtbSubst;
   private Timestamp dtInclusao;
   private Timestamp dtAlter;
   private BigDecimal codUsu;
   private Timestamp dtInativ;
   private String lalurACred;
   private String recDesp;
   private String tabelaCred;
   private BigDecimal naturezaEfd;
   private BigDecimal codRazAux;
   private String tabela;
   private BigDecimal tipSalAlur;
   private String lalurA;
   private BigDecimal codConta;
   private String codLalurB;
   private String descrConta;
   private String indTribLalurB;
   private String conResultCsll;
   private String conResultIrpj;
   private String exclusoesCsll;
   private String exclusoesIrpj;
   private String pat4Irpj;
   private String zeraCrCsll;
   private String zeraCrIrpj;
   private String classifCsll;
   private String classifIrpj;
   private String tabelaLalurB;

   public String getAnalitica() {
        return analitica;
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
        this.analitica = analitica;
   }

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
        this.ativa = ativa;
   }

   public String getBemOriginal() {
        return bemOriginal;
   }

   public void setBemOriginal(String bemOriginal) {
        markAsChanged("BEMORIGINAL", bemOriginal);
        this.bemOriginal = bemOriginal;
   }

   public String getBemOutros() {
        return bemOutros;
   }

   public void setBemOutros(String bemOutros) {
        markAsChanged("BEMOUTROS", bemOutros);
        this.bemOutros = bemOutros;
   }

   public String getBemResreav() {
        return bemResreav;
   }

   public void setBemResreav(String bemResreav) {
        markAsChanged("BEMRESREAV", bemResreav);
        this.bemResreav = bemResreav;
   }

   public String getCencusObrig() {
        return cencusObrig;
   }

   public void setCencusObrig(String cencusObrig) {
        markAsChanged("CENCUSOBRIG", cencusObrig);
        this.cencusObrig = cencusObrig;
   }

   public BigDecimal getCodCtaCtbPai() {
        return codCtaCtbPai;
   }

   public void setCodCtaCtbPai(BigDecimal codCtaCtbPai) {
        markAsChanged("CODCTACTBPAI", codCtaCtbPai);
        this.codCtaCtbPai = codCtaCtbPai;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getCodGrupoCta() {
        return codGrupoCta;
   }

   public void setCodGrupoCta(String codGrupoCta) {
        markAsChanged("CODGRUPOCTA", codGrupoCta);
        this.codGrupoCta = codGrupoCta;
   }

   public String getConvSaldoMoeda() {
        return convSaldoMoeda;
   }

   public void setConvSaldoMoeda(String convSaldoMoeda) {
        markAsChanged("CONVSALDOMOEDA", convSaldoMoeda);
        this.convSaldoMoeda = convSaldoMoeda;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public String getCtaCtb() {
        return ctaCtb;
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
        this.ctaCtb = ctaCtb;
   }

   public String getDescrCta() {
        return descrCta;
   }

   public void setDescrCta(String descrCta) {
        markAsChanged("DESCRCTA", descrCta);
        this.descrCta = descrCta;
   }

   public String getDtBaseConvMoeda() {
        return dtBaseConvMoeda;
   }

   public void setDtBaseConvMoeda(String dtBaseConvMoeda) {
        markAsChanged("DTBASECONVMOEDA", dtBaseConvMoeda);
        this.dtBaseConvMoeda = dtBaseConvMoeda;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
        this.grau = grau;
   }

   public String getObservacoes() {
        return observacoes;
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
        this.observacoes = observacoes;
   }

   public BigDecimal getPlanta() {
        return planta;
   }

   public void setPlanta(BigDecimal planta) {
        markAsChanged("PLANTA", planta);
        this.planta = planta;
   }

   public BigDecimal getProcesso() {
        return processo;
   }

   public void setProcesso(BigDecimal processo) {
        markAsChanged("PROCESSO", processo);
        this.processo = processo;
   }

   public BigDecimal getProduto() {
        return produto;
   }

   public void setProduto(BigDecimal produto) {
        markAsChanged("PRODUTO", produto);
        this.produto = produto;
   }

   public String getProjObrig() {
        return projObrig;
   }

   public void setProjObrig(String projObrig) {
        markAsChanged("PROJOBRIG", projObrig);
        this.projObrig = projObrig;
   }

   public String getPodeLancToManual() {
        return podeLancToManual;
   }

   public void setPodeLancToManual(String podeLancToManual) {
        markAsChanged("PODELANCTOMANUAL", podeLancToManual);
        this.podeLancToManual = podeLancToManual;
   }

   public BigDecimal getCodCtaCtbSubst() {
        return codCtaCtbSubst;
   }

   public void setCodCtaCtbSubst(BigDecimal codCtaCtbSubst) {
        markAsChanged("CODCTACTBSUBST", codCtaCtbSubst);
        this.codCtaCtbSubst = codCtaCtbSubst;
   }

   public Timestamp getDtInclusao() {
        return dtInclusao;
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
        this.dtInclusao = dtInclusao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtInativ() {
        return dtInativ;
   }

   public void setDtInativ(Timestamp dtInativ) {
        markAsChanged("DTINATIV", dtInativ);
        this.dtInativ = dtInativ;
   }

   public String getLalurACred() {
        return lalurACred;
   }

   public void setLalurACred(String lalurACred) {
        markAsChanged("LALUR_A_CRED", lalurACred);
        this.lalurACred = lalurACred;
   }

   public String getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
        this.recDesp = recDesp;
   }

   public String getTabelaCred() {
        return tabelaCred;
   }

   public void setTabelaCred(String tabelaCred) {
        markAsChanged("TABELACRED", tabelaCred);
        this.tabelaCred = tabelaCred;
   }

   public BigDecimal getNaturezaEfd() {
        return naturezaEfd;
   }

   public void setNaturezaEfd(BigDecimal naturezaEfd) {
        markAsChanged("NATUREZAEFD", naturezaEfd);
        this.naturezaEfd = naturezaEfd;
   }

   public BigDecimal getCodRazAux() {
        return codRazAux;
   }

   public void setCodRazAux(BigDecimal codRazAux) {
        markAsChanged("CODRAZAUX", codRazAux);
        this.codRazAux = codRazAux;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public BigDecimal getTipSalAlur() {
        return tipSalAlur;
   }

   public void setTipSalAlur(BigDecimal tipSalAlur) {
        markAsChanged("TIPSALALUR", tipSalAlur);
        this.tipSalAlur = tipSalAlur;
   }

   public String getLalurA() {
        return lalurA;
   }

   public void setLalurA(String lalurA) {
        markAsChanged("LALUR_A", lalurA);
        this.lalurA = lalurA;
   }

   public BigDecimal getCodConta() {
        return codConta;
   }

   public void setCodConta(BigDecimal codConta) {
        markAsChanged("CODCONTA", codConta);
        this.codConta = codConta;
   }

   public String getCodLalurB() {
        return codLalurB;
   }

   public void setCodLalurB(String codLalurB) {
        markAsChanged("CODLALURB", codLalurB);
        this.codLalurB = codLalurB;
   }

   public String getDescrConta() {
        return descrConta;
   }

   public void setDescrConta(String descrConta) {
        markAsChanged("DESCRCONTA", descrConta);
        this.descrConta = descrConta;
   }

   public String getIndTribLalurB() {
        return indTribLalurB;
   }

   public void setIndTribLalurB(String indTribLalurB) {
        markAsChanged("INDTRIBLALURB", indTribLalurB);
        this.indTribLalurB = indTribLalurB;
   }

   public String getConResultCsll() {
        return conResultCsll;
   }

   public void setConResultCsll(String conResultCsll) {
        markAsChanged("CONRESULTCSLL", conResultCsll);
        this.conResultCsll = conResultCsll;
   }

   public String getConResultIrpj() {
        return conResultIrpj;
   }

   public void setConResultIrpj(String conResultIrpj) {
        markAsChanged("CONRESULTIRPJ", conResultIrpj);
        this.conResultIrpj = conResultIrpj;
   }

   public String getExclusoesCsll() {
        return exclusoesCsll;
   }

   public void setExclusoesCsll(String exclusoesCsll) {
        markAsChanged("EXCLUSOESCSLL", exclusoesCsll);
        this.exclusoesCsll = exclusoesCsll;
   }

   public String getExclusoesIrpj() {
        return exclusoesIrpj;
   }

   public void setExclusoesIrpj(String exclusoesIrpj) {
        markAsChanged("EXCLUSOESIRPJ", exclusoesIrpj);
        this.exclusoesIrpj = exclusoesIrpj;
   }

   public String getPat4Irpj() {
        return pat4Irpj;
   }

   public void setPat4Irpj(String pat4Irpj) {
        markAsChanged("PAT4IRPJ", pat4Irpj);
        this.pat4Irpj = pat4Irpj;
   }

   public String getZeraCrCsll() {
        return zeraCrCsll;
   }

   public void setZeraCrCsll(String zeraCrCsll) {
        markAsChanged("ZERACRCSLL", zeraCrCsll);
        this.zeraCrCsll = zeraCrCsll;
   }

   public String getZeraCrIrpj() {
        return zeraCrIrpj;
   }

   public void setZeraCrIrpj(String zeraCrIrpj) {
        markAsChanged("ZERACRIRPJ", zeraCrIrpj);
        this.zeraCrIrpj = zeraCrIrpj;
   }

   public String getClassifCsll() {
        return classifCsll;
   }

   public void setClassifCsll(String classifCsll) {
        markAsChanged("CLASSIFCSLL", classifCsll);
        this.classifCsll = classifCsll;
   }

   public String getClassifIrpj() {
        return classifIrpj;
   }

   public void setClassifIrpj(String classifIrpj) {
        markAsChanged("CLASSIFIRPJ", classifIrpj);
        this.classifIrpj = classifIrpj;
   }

   public String getTabelaLalurB() {
        return tabelaLalurB;
   }

   public void setTabelaLalurB(String tabelaLalurB) {
        markAsChanged("TABELALALURB", tabelaLalurB);
        this.tabelaLalurB = tabelaLalurB;
   }

   @Override
   public String getTableName() {
        return "TCBPLA";
   }

   @Override
   public String getEntityName() {
        return "PlanoConta";
   }

   @Override
   public PlanoConta fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.analitica = vo.asString("ANALITICA");
        this.ativa = vo.asString("ATIVA");
        this.bemOriginal = vo.asString("BEMORIGINAL");
        this.bemOutros = vo.asString("BEMOUTROS");
        this.bemResreav = vo.asString("BEMRESREAV");
        this.cencusObrig = vo.asString("CENCUSOBRIG");
        this.codCtaCtbPai = vo.asBigDecimal("CODCTACTBPAI");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codGrupoCta = vo.asString("CODGRUPOCTA");
        this.convSaldoMoeda = vo.asString("CONVSALDOMOEDA");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.ctaCtb = vo.asString("CTACTB");
        this.descrCta = vo.asString("DESCRCTA");
        this.dtBaseConvMoeda = vo.asString("DTBASECONVMOEDA");
        this.grau = vo.asBigDecimal("GRAU");
        this.observacoes = vo.asString("OBSERVACOES");
        this.planta = vo.asBigDecimal("PLANTA");
        this.processo = vo.asBigDecimal("PROCESSO");
        this.produto = vo.asBigDecimal("PRODUTO");
        this.projObrig = vo.asString("PROJOBRIG");
        this.podeLancToManual = vo.asString("PODELANCTOMANUAL");
        this.codCtaCtbSubst = vo.asBigDecimal("CODCTACTBSUBST");
        this.dtInclusao = vo.asTimestamp("DTINCLUSAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtInativ = vo.asTimestamp("DTINATIV");
        this.lalurACred = vo.asString("LALUR_A_CRED");
        this.recDesp = vo.asString("RECDESP");
        this.tabelaCred = vo.asString("TABELACRED");
        this.naturezaEfd = vo.asBigDecimal("NATUREZAEFD");
        this.codRazAux = vo.asBigDecimal("CODRAZAUX");
        this.tabela = vo.asString("TABELA");
        this.tipSalAlur = vo.asBigDecimal("TIPSALALUR");
        this.lalurA = vo.asString("LALUR_A");
        this.codConta = vo.asBigDecimal("CODCONTA");
        this.codLalurB = vo.asString("CODLALURB");
        this.descrConta = vo.asString("DESCRCONTA");
        this.indTribLalurB = vo.asString("INDTRIBLALURB");
        this.conResultCsll = vo.asString("CONRESULTCSLL");
        this.conResultIrpj = vo.asString("CONRESULTIRPJ");
        this.exclusoesCsll = vo.asString("EXCLUSOESCSLL");
        this.exclusoesIrpj = vo.asString("EXCLUSOESIRPJ");
        this.pat4Irpj = vo.asString("PAT4IRPJ");
        this.zeraCrCsll = vo.asString("ZERACRCSLL");
        this.zeraCrIrpj = vo.asString("ZERACRIRPJ");
        this.classifCsll = vo.asString("CLASSIFCSLL");
        this.classifIrpj = vo.asString("CLASSIFIRPJ");
        this.tabelaLalurB = vo.asString("TABELALALURB");
        return this;
   }
}
