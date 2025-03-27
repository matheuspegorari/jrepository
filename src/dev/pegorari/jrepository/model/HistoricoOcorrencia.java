package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoOcorrencia extends AbstractSankhyaEntity<HistoricoOcorrencia> {
   public String getAfastamento() {
        return this.getVo().asString("AFASTAMENTO");
   }

   public void setAfastamento(String afastamento) {
        markAsChanged("AFASTAMENTO", afastamento);
   }

   public BigDecimal getCodAfaCausa() {
        return this.getVo().asBigDecimal("CODAFACAUSA");
   }

   public void setCodAfaCausa(BigDecimal codAfaCausa) {
        markAsChanged("CODAFACAUSA", codAfaCausa);
   }

   public BigDecimal getCodAfaRais() {
        return this.getVo().asBigDecimal("CODAFARAIS");
   }

   public void setCodAfaRais(BigDecimal codAfaRais) {
        markAsChanged("CODAFARAIS", codAfaRais);
   }

   public String getCodAfast() {
        return this.getVo().asString("CODAFAST");
   }

   public void setCodAfast(String codAfast) {
        markAsChanged("CODAFAST", codAfast);
   }

   public BigDecimal getCodHistOcor() {
        return this.getVo().asBigDecimal("CODHISTOCOR");
   }

   public void setCodHistOcor(BigDecimal codHistOcor) {
        markAsChanged("CODHISTOCOR", codHistOcor);
   }

   public String getDescrHistOcor() {
        return this.getVo().asString("DESCRHISTOCOR");
   }

   public void setDescrHistOcor(String descrHistOcor) {
        markAsChanged("DESCRHISTOCOR", descrHistOcor);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getFalta() {
        return this.getVo().asString("FALTA");
   }

   public void setFalta(String falta) {
        markAsChanged("FALTA", falta);
   }

   public String getTipTab() {
        return this.getVo().asString("TIPTAB");
   }

   public void setTipTab(String tipTab) {
        markAsChanged("TIPTAB", tipTab);
   }

   public String getAbateAvisoPrevio() {
        return this.getVo().asString("ABATEAVISOPREVIO");
   }

   public void setAbateAvisoPrevio(String abateAvisoPrevio) {
        markAsChanged("ABATEAVISOPREVIO", abateAvisoPrevio);
   }

   public String getAbsentismo() {
        return this.getVo().asString("ABSENTEISMO");
   }

   public void setAbsentismo(String absentismo) {
        markAsChanged("ABSENTEISMO", absentismo);
   }

   public String getAnexoObrigatorio() {
        return this.getVo().asString("ANEXOOBRIGATORIO");
   }

   public void setAnexoObrigatorio(String anexoObrigatorio) {
        markAsChanged("ANEXOOBRIGATORIO", anexoObrigatorio);
   }

   public String getAparecePortal() {
        return this.getVo().asString("APARECEPORTAL");
   }

   public void setAparecePortal(String aparecePortal) {
        markAsChanged("APARECEPORTAL", aparecePortal);
   }

   public String getApelido() {
        return this.getVo().asString("APELIDO");
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
   }

   public String getBaixaProvisao() {
        return this.getVo().asString("BAIXAPROVISAO");
   }

   public void setBaixaProvisao(String baixaProvisao) {
        markAsChanged("BAIXAPROVISAO", baixaProvisao);
   }

   public BigDecimal getCodGrupoOco() {
        return this.getVo().asBigDecimal("CODGRUPOOCO");
   }

   public void setCodGrupoOco(BigDecimal codGrupoOco) {
        markAsChanged("CODGRUPOOCO", codGrupoOco);
   }

   public String getCodMotAfast() {
        return this.getVo().asString("CODMOTAFAST");
   }

   public void setCodMotAfast(String codMotAfast) {
        markAsChanged("CODMOTAFAST", codMotAfast);
   }

   public String getCompNProg() {
        return this.getVo().asString("COMPNPROG");
   }

   public void setCompNProg(String compNProg) {
        markAsChanged("COMPNPROG", compNProg);
   }

   public String getCor() {
        return this.getVo().asString("COR");
   }

   public void setCor(String cor) {
        markAsChanged("COR", cor);
   }

   public String getDescartaOPonto() {
        return this.getVo().asString("DESCARTAOPONTO");
   }

   public void setDescartaOPonto(String descartaOPonto) {
        markAsChanged("DESCARTAOPONTO", descartaOPonto);
   }

   public String getDireitoAdn() {
        return this.getVo().asString("DIREITOADN");
   }

   public void setDireitoAdn(String direitoAdn) {
        markAsChanged("DIREITOADN", direitoAdn);
   }

   public BigDecimal getHrCompl() {
        return this.getVo().asBigDecimal("HRCOMPL");
   }

   public void setHrCompl(BigDecimal hrCompl) {
        markAsChanged("HRCOMPL", hrCompl);
   }

   public String getIndenizaEstab() {
        return this.getVo().asString("INDENIZAESTAB");
   }

   public void setIndenizaEstab(String indenizaEstab) {
        markAsChanged("INDENIZAESTAB", indenizaEstab);
   }

   public String getOcorrenciaAfdt() {
        return this.getVo().asString("OCORRENCIAAFDT");
   }

   public void setOcorrenciaAfdt(String ocorrenciaAfdt) {
        markAsChanged("OCORRENCIAAFDT", ocorrenciaAfdt);
   }

   public String getQFerAfart133() {
        return this.getVo().asString("QFERAFART133");
   }

   public void setQFerAfart133(String qFerAfart133) {
        markAsChanged("QFERAFART133", qFerAfart133);
   }

   public BigDecimal getQtdMesesEstab() {
        return this.getVo().asBigDecimal("QTDMESESESTAB");
   }

   public void setQtdMesesEstab(BigDecimal qtdMesesEstab) {
        markAsChanged("QTDMESESESTAB", qtdMesesEstab);
   }

   public String getQuitaFerLicRem() {
        return this.getVo().asString("QUITAFERLICREM");
   }

   public void setQuitaFerLicRem(String quitaFerLicRem) {
        markAsChanged("QUITAFERLICREM", quitaFerLicRem);
   }

   public String getReajSalSind() {
        return this.getVo().asString("REAJSALSIND");
   }

   public void setReajSalSind(String reajSalSind) {
        markAsChanged("REAJSALSIND", reajSalSind);
   }

   public String getReduzDiasTrab() {
        return this.getVo().asString("REDUZDIASTRAB");
   }

   public void setReduzDiasTrab(String reduzDiasTrab) {
        markAsChanged("REDUZDIASTRAB", reduzDiasTrab);
   }

   public String getSuspComResiduo() {
        return this.getVo().asString("SUSPCOMRESIDUO");
   }

   public void setSuspComResiduo(String suspComResiduo) {
        markAsChanged("SUSPCOMRESIDUO", suspComResiduo);
   }

   public String getTipReg() {
        return this.getVo().asString("TIPREG");
   }

   public void setTipReg(String tipReg) {
        markAsChanged("TIPREG", tipReg);
   }

   public String getUtilizaMotivo() {
        return this.getVo().asString("UTILIZAMOTIVO");
   }

   public void setUtilizaMotivo(String utilizaMotivo) {
        markAsChanged("UTILIZAMOTIVO", utilizaMotivo);
   }

   public String getDeduzDiasAviso() {
        return this.getVo().asString("DEDUZDIASAVISO");
   }

   public void setDeduzDiasAviso(String deduzDiasAviso) {
        markAsChanged("DEDUZDIASAVISO", deduzDiasAviso);
   }

   @Override
   public String getTableName() {
        return "TFPHIS";
   }

   @Override
   public String getEntityName() {
        return "HistoricoOcorrencia";
   }

   @Override
   public HistoricoOcorrencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
