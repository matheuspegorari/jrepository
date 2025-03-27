package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Projeto extends AbstractSankhyaEntity<Projeto> {
   public String getAbreviatura() {
        return this.getVo().asString("ABREVIATURA");
   }

   public void setAbreviatura(String abreviatura) {
        markAsChanged("ABREVIATURA", abreviatura);
   }

   public BigDecimal getAmostraCusMax() {
        return this.getVo().asBigDecimal("AMOSTRACUSMAX");
   }

   public void setAmostraCusMax(BigDecimal amostraCusMax) {
        markAsChanged("AMOSTRACUSMAX", amostraCusMax);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCargaHorMax() {
        return this.getVo().asBigDecimal("CARGAHORMAX");
   }

   public void setCargaHorMax(BigDecimal cargaHorMax) {
        markAsChanged("CARGAHORMAX", cargaHorMax);
   }

   public BigDecimal getCodClt() {
        return this.getVo().asBigDecimal("CODCLT");
   }

   public void setCodClt(BigDecimal codClt) {
        markAsChanged("CODCLT", codClt);
   }

   public BigDecimal getCodCtActb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtActb(BigDecimal codCtActb) {
        markAsChanged("CODCTACTB", codCtActb);
   }

   public BigDecimal getCodCtActb2() {
        return this.getVo().asBigDecimal("CODCTACTB2");
   }

   public void setCodCtActb2(BigDecimal codCtActb2) {
        markAsChanged("CODCTACTB2", codCtActb2);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodProj() {
        return this.getVo().asBigDecimal("CODPROJ");
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
   }

   public BigDecimal getCodProjPai() {
        return this.getVo().asBigDecimal("CODPROJPAI");
   }

   public void setCodProjPai(BigDecimal codProjPai) {
        markAsChanged("CODPROJPAI", codProjPai);
   }

   public BigDecimal getCodUsuResp() {
        return this.getVo().asBigDecimal("CODUSURESP");
   }

   public void setCodUsuResp(BigDecimal codUsuResp) {
        markAsChanged("CODUSURESP", codUsuResp);
   }

   public Timestamp getDtInicio() {
        return this.getVo().asTimestamp("DTINICIO");
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
   }

   public Timestamp getDtTermino() {
        return this.getVo().asTimestamp("DTTERMINO");
   }

   public void setDtTermino(Timestamp dtTermino) {
        markAsChanged("DTTERMINO", dtTermino);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public BigDecimal getHrFinalMax() {
        return this.getVo().asBigDecimal("HRFINALMAX");
   }

   public void setHrFinalMax(BigDecimal hrFinalMax) {
        markAsChanged("HRFINALMAX", hrFinalMax);
   }

   public BigDecimal getHrInicialMin() {
        return this.getVo().asBigDecimal("HRINICIALMIN");
   }

   public void setHrInicialMin(BigDecimal hrInicialMin) {
        markAsChanged("HRINICIALMIN", hrInicialMin);
   }

   public String getIdentificacao() {
        return this.getVo().asString("IDENTIFICACAO");
   }

   public void setIdentificacao(String identificacao) {
        markAsChanged("IDENTIFICACAO", identificacao);
   }

   public BigDecimal getIntervaloMax() {
        return this.getVo().asBigDecimal("INTERVALOMAX");
   }

   public void setIntervaloMax(BigDecimal intervaloMax) {
        markAsChanged("INTERVALOMAX", intervaloMax);
   }

   public BigDecimal getIntervaloMin() {
        return this.getVo().asBigDecimal("INTERVALOMIN");
   }

   public void setIntervaloMin(BigDecimal intervaloMin) {
        markAsChanged("INTERVALOMIN", intervaloMin);
   }

   public BigDecimal getLimBonif() {
        return this.getVo().asBigDecimal("LIMBONIF");
   }

   public void setLimBonif(BigDecimal limBonif) {
        markAsChanged("LIMBONIF", limBonif);
   }

   public BigDecimal getNuQue() {
        return this.getVo().asBigDecimal("NUQUE");
   }

   public void setNuQue(BigDecimal nuQue) {
        markAsChanged("NUQUE", nuQue);
   }

   public BigDecimal getPercRetencao() {
        return this.getVo().asBigDecimal("PERCRETENCAO");
   }

   public void setPercRetencao(BigDecimal percRetencao) {
        markAsChanged("PERCRETENCAO", percRetencao);
   }

   public String getRetencaoAtiva() {
        return this.getVo().asString("RETENCAOATIVA");
   }

   public void setRetencaoAtiva(String retencaoAtiva) {
        markAsChanged("RETENCAOATIVA", retencaoAtiva);
   }

   public BigDecimal getUltimoRdo() {
        return this.getVo().asBigDecimal("ULTIMORDO");
   }

   public void setUltimoRdo(BigDecimal ultimoRdo) {
        markAsChanged("ULTIMORDO", ultimoRdo);
   }

   public String getTimContaCompart() {
        return this.getVo().asString("TIMCONTACOMPART");
   }

   public void setTimContaCompart(String timContaCompart) {
        markAsChanged("TIMCONTACOMPART", timContaCompart);
   }

   public BigDecimal getTimNmCtaComp() {
        return this.getVo().asBigDecimal("TIMNMCTACOMP");
   }

   public void setTimNmCtaComp(BigDecimal timNmCtaComp) {
        markAsChanged("TIMNMCTACOMP", timNmCtaComp);
   }

   public BigDecimal getTimParcProj() {
        return this.getVo().asBigDecimal("TIMPARCPROJ");
   }

   public void setTimParcProj(BigDecimal timParcProj) {
        markAsChanged("TIMPARCPROJ", timParcProj);
   }

   public BigDecimal getTimTxPart() {
        return this.getVo().asBigDecimal("TIMTXPART");
   }

   public void setTimTxPart(BigDecimal timTxPart) {
        markAsChanged("TIMTXPART", timTxPart);
   }

   @Override
   public String getTableName() {
        return "TCSPRJ";
   }

   @Override
   public String getEntityName() {
        return "Projeto";
   }

   @Override
   public Projeto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
