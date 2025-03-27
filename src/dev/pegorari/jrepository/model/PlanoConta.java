package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PlanoConta extends AbstractSankhyaEntity<PlanoConta> {
   public String getAnalitica() {
        return this.getVo().asString("ANALITICA");
   }

   public void setAnalitica(String analitica) {
        markAsChanged("ANALITICA", analitica);
   }

   public String getAtiva() {
        return this.getVo().asString("ATIVA");
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
   }

   public String getBemOriginal() {
        return this.getVo().asString("BEMORIGINAL");
   }

   public void setBemOriginal(String bemOriginal) {
        markAsChanged("BEMORIGINAL", bemOriginal);
   }

   public String getBemOutros() {
        return this.getVo().asString("BEMOUTROS");
   }

   public void setBemOutros(String bemOutros) {
        markAsChanged("BEMOUTROS", bemOutros);
   }

   public String getBemResreav() {
        return this.getVo().asString("BEMRESREAV");
   }

   public void setBemResreav(String bemResreav) {
        markAsChanged("BEMRESREAV", bemResreav);
   }

   public String getCencusObrig() {
        return this.getVo().asString("CENCUSOBRIG");
   }

   public void setCencusObrig(String cencusObrig) {
        markAsChanged("CENCUSOBRIG", cencusObrig);
   }

   public BigDecimal getCodCtaCtbPai() {
        return this.getVo().asBigDecimal("CODCTACTBPAI");
   }

   public void setCodCtaCtbPai(BigDecimal codCtaCtbPai) {
        markAsChanged("CODCTACTBPAI", codCtaCtbPai);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodGrupoCta() {
        return this.getVo().asString("CODGRUPOCTA");
   }

   public void setCodGrupoCta(String codGrupoCta) {
        markAsChanged("CODGRUPOCTA", codGrupoCta);
   }

   public String getConvSaldoMoeda() {
        return this.getVo().asString("CONVSALDOMOEDA");
   }

   public void setConvSaldoMoeda(String convSaldoMoeda) {
        markAsChanged("CONVSALDOMOEDA", convSaldoMoeda);
   }

   public BigDecimal getCodCtaCtb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
   }

   public String getCtaCtb() {
        return this.getVo().asString("CTACTB");
   }

   public void setCtaCtb(String ctaCtb) {
        markAsChanged("CTACTB", ctaCtb);
   }

   public String getDescrCta() {
        return this.getVo().asString("DESCRCTA");
   }

   public void setDescrCta(String descrCta) {
        markAsChanged("DESCRCTA", descrCta);
   }

   public String getDtBaseConvMoeda() {
        return this.getVo().asString("DTBASECONVMOEDA");
   }

   public void setDtBaseConvMoeda(String dtBaseConvMoeda) {
        markAsChanged("DTBASECONVMOEDA", dtBaseConvMoeda);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getObservacoes() {
        return this.getVo().asString("OBSERVACOES");
   }

   public void setObservacoes(String observacoes) {
        markAsChanged("OBSERVACOES", observacoes);
   }

   public BigDecimal getPlanta() {
        return this.getVo().asBigDecimal("PLANTA");
   }

   public void setPlanta(BigDecimal planta) {
        markAsChanged("PLANTA", planta);
   }

   public BigDecimal getProcesso() {
        return this.getVo().asBigDecimal("PROCESSO");
   }

   public void setProcesso(BigDecimal processo) {
        markAsChanged("PROCESSO", processo);
   }

   public BigDecimal getProduto() {
        return this.getVo().asBigDecimal("PRODUTO");
   }

   public void setProduto(BigDecimal produto) {
        markAsChanged("PRODUTO", produto);
   }

   public String getProjObrig() {
        return this.getVo().asString("PROJOBRIG");
   }

   public void setProjObrig(String projObrig) {
        markAsChanged("PROJOBRIG", projObrig);
   }

   public String getPodeLancToManual() {
        return this.getVo().asString("PODELANCTOMANUAL");
   }

   public void setPodeLancToManual(String podeLancToManual) {
        markAsChanged("PODELANCTOMANUAL", podeLancToManual);
   }

   public BigDecimal getCodCtaCtbSubst() {
        return this.getVo().asBigDecimal("CODCTACTBSUBST");
   }

   public void setCodCtaCtbSubst(BigDecimal codCtaCtbSubst) {
        markAsChanged("CODCTACTBSUBST", codCtaCtbSubst);
   }

   public Timestamp getDtInclusao() {
        return this.getVo().asTimestamp("DTINCLUSAO");
   }

   public void setDtInclusao(Timestamp dtInclusao) {
        markAsChanged("DTINCLUSAO", dtInclusao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtInativ() {
        return this.getVo().asTimestamp("DTINATIV");
   }

   public void setDtInativ(Timestamp dtInativ) {
        markAsChanged("DTINATIV", dtInativ);
   }

   public String getLalurACred() {
        return this.getVo().asString("LALUR_A_CRED");
   }

   public void setLalurACred(String lalurACred) {
        markAsChanged("LALUR_A_CRED", lalurACred);
   }

   public String getRecDesp() {
        return this.getVo().asString("RECDESP");
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public String getTabelaCred() {
        return this.getVo().asString("TABELACRED");
   }

   public void setTabelaCred(String tabelaCred) {
        markAsChanged("TABELACRED", tabelaCred);
   }

   public BigDecimal getNaturezaEfd() {
        return this.getVo().asBigDecimal("NATUREZAEFD");
   }

   public void setNaturezaEfd(BigDecimal naturezaEfd) {
        markAsChanged("NATUREZAEFD", naturezaEfd);
   }

   public BigDecimal getCodRazAux() {
        return this.getVo().asBigDecimal("CODRAZAUX");
   }

   public void setCodRazAux(BigDecimal codRazAux) {
        markAsChanged("CODRAZAUX", codRazAux);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public BigDecimal getTipSalAlur() {
        return this.getVo().asBigDecimal("TIPSALALUR");
   }

   public void setTipSalAlur(BigDecimal tipSalAlur) {
        markAsChanged("TIPSALALUR", tipSalAlur);
   }

   public String getLalurA() {
        return this.getVo().asString("LALUR_A");
   }

   public void setLalurA(String lalurA) {
        markAsChanged("LALUR_A", lalurA);
   }

   public BigDecimal getCodConta() {
        return this.getVo().asBigDecimal("CODCONTA");
   }

   public void setCodConta(BigDecimal codConta) {
        markAsChanged("CODCONTA", codConta);
   }

   public String getCodLalurB() {
        return this.getVo().asString("CODLALURB");
   }

   public void setCodLalurB(String codLalurB) {
        markAsChanged("CODLALURB", codLalurB);
   }

   public String getDescrConta() {
        return this.getVo().asString("DESCRCONTA");
   }

   public void setDescrConta(String descrConta) {
        markAsChanged("DESCRCONTA", descrConta);
   }

   public String getIndTribLalurB() {
        return this.getVo().asString("INDTRIBLALURB");
   }

   public void setIndTribLalurB(String indTribLalurB) {
        markAsChanged("INDTRIBLALURB", indTribLalurB);
   }

   public String getConResultCsll() {
        return this.getVo().asString("CONRESULTCSLL");
   }

   public void setConResultCsll(String conResultCsll) {
        markAsChanged("CONRESULTCSLL", conResultCsll);
   }

   public String getConResultIrpj() {
        return this.getVo().asString("CONRESULTIRPJ");
   }

   public void setConResultIrpj(String conResultIrpj) {
        markAsChanged("CONRESULTIRPJ", conResultIrpj);
   }

   public String getExclusoesCsll() {
        return this.getVo().asString("EXCLUSOESCSLL");
   }

   public void setExclusoesCsll(String exclusoesCsll) {
        markAsChanged("EXCLUSOESCSLL", exclusoesCsll);
   }

   public String getExclusoesIrpj() {
        return this.getVo().asString("EXCLUSOESIRPJ");
   }

   public void setExclusoesIrpj(String exclusoesIrpj) {
        markAsChanged("EXCLUSOESIRPJ", exclusoesIrpj);
   }

   public String getPat4Irpj() {
        return this.getVo().asString("PAT4IRPJ");
   }

   public void setPat4Irpj(String pat4Irpj) {
        markAsChanged("PAT4IRPJ", pat4Irpj);
   }

   public String getZeraCrCsll() {
        return this.getVo().asString("ZERACRCSLL");
   }

   public void setZeraCrCsll(String zeraCrCsll) {
        markAsChanged("ZERACRCSLL", zeraCrCsll);
   }

   public String getZeraCrIrpj() {
        return this.getVo().asString("ZERACRIRPJ");
   }

   public void setZeraCrIrpj(String zeraCrIrpj) {
        markAsChanged("ZERACRIRPJ", zeraCrIrpj);
   }

   public String getClassifCsll() {
        return this.getVo().asString("CLASSIFCSLL");
   }

   public void setClassifCsll(String classifCsll) {
        markAsChanged("CLASSIFCSLL", classifCsll);
   }

   public String getClassifIrpj() {
        return this.getVo().asString("CLASSIFIRPJ");
   }

   public void setClassifIrpj(String classifIrpj) {
        markAsChanged("CLASSIFIRPJ", classifIrpj);
   }

   public String getTabelaLalurB() {
        return this.getVo().asString("TABELALALURB");
   }

   public void setTabelaLalurB(String tabelaLalurB) {
        markAsChanged("TABELALALURB", tabelaLalurB);
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
        this.setVo(vo);
        return this;
   }
}
