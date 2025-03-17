package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoOcorrencia extends AbstractSankhyaEntity<HistoricoOcorrencia> {
   private String afastamento;
   private BigDecimal codAfaCausa;
   private BigDecimal codAfaRais;
   private String codAfast;
   private BigDecimal codHistOcor;
   private String descrHistOcor;
   private Timestamp dtAlter;
   private String falta;
   private String tipTab;
   private String abateAvisoPrevio;
   private String absentismo;
   private String anexoObrigatorio;
   private String aparecePortal;
   private String apelido;
   private String baixaProvisao;
   private BigDecimal codGrupoOco;
   private String codMotAfast;
   private String compNProg;
   private String cor;
   private String descartaOPonto;
   private String direitoAdn;
   private BigDecimal hrCompl;
   private String indenizaEstab;
   private String ocorrenciaAfdt;
   private String qFerAfart133;
   private BigDecimal qtdMesesEstab;
   private String quitaFerLicRem;
   private String reajSalSind;
   private String reduzDiasTrab;
   private String suspComResiduo;
   private String tipReg;
   private String utilizaMotivo;
   private String deduzDiasAviso;

   public String getAfastamento() {
        return afastamento;
   }

   public void setAfastamento(String afastamento) {
        this.afastamento = afastamento;
   }

   public BigDecimal getCodAfaCausa() {
        return codAfaCausa;
   }

   public void setCodAfaCausa(BigDecimal codAfaCausa) {
        this.codAfaCausa = codAfaCausa;
   }

   public BigDecimal getCodAfaRais() {
        return codAfaRais;
   }

   public void setCodAfaRais(BigDecimal codAfaRais) {
        this.codAfaRais = codAfaRais;
   }

   public String getCodAfast() {
        return codAfast;
   }

   public void setCodAfast(String codAfast) {
        this.codAfast = codAfast;
   }

   public BigDecimal getCodHistOcor() {
        return codHistOcor;
   }

   public void setCodHistOcor(BigDecimal codHistOcor) {
        this.codHistOcor = codHistOcor;
   }

   public String getDescrHistOcor() {
        return descrHistOcor;
   }

   public void setDescrHistOcor(String descrHistOcor) {
        this.descrHistOcor = descrHistOcor;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getFalta() {
        return falta;
   }

   public void setFalta(String falta) {
        this.falta = falta;
   }

   public String getTipTab() {
        return tipTab;
   }

   public void setTipTab(String tipTab) {
        this.tipTab = tipTab;
   }

   public String getAbateAvisoPrevio() {
        return abateAvisoPrevio;
   }

   public void setAbateAvisoPrevio(String abateAvisoPrevio) {
        this.abateAvisoPrevio = abateAvisoPrevio;
   }

   public String getAbsentismo() {
        return absentismo;
   }

   public void setAbsentismo(String absentismo) {
        this.absentismo = absentismo;
   }

   public String getAnexoObrigatorio() {
        return anexoObrigatorio;
   }

   public void setAnexoObrigatorio(String anexoObrigatorio) {
        this.anexoObrigatorio = anexoObrigatorio;
   }

   public String getAparecePortal() {
        return aparecePortal;
   }

   public void setAparecePortal(String aparecePortal) {
        this.aparecePortal = aparecePortal;
   }

   public String getApelido() {
        return apelido;
   }

   public void setApelido(String apelido) {
        this.apelido = apelido;
   }

   public String getBaixaProvisao() {
        return baixaProvisao;
   }

   public void setBaixaProvisao(String baixaProvisao) {
        this.baixaProvisao = baixaProvisao;
   }

   public BigDecimal getCodGrupoOco() {
        return codGrupoOco;
   }

   public void setCodGrupoOco(BigDecimal codGrupoOco) {
        this.codGrupoOco = codGrupoOco;
   }

   public String getCodMotAfast() {
        return codMotAfast;
   }

   public void setCodMotAfast(String codMotAfast) {
        this.codMotAfast = codMotAfast;
   }

   public String getCompNProg() {
        return compNProg;
   }

   public void setCompNProg(String compNProg) {
        this.compNProg = compNProg;
   }

   public String getCor() {
        return cor;
   }

   public void setCor(String cor) {
        this.cor = cor;
   }

   public String getDescartaOPonto() {
        return descartaOPonto;
   }

   public void setDescartaOPonto(String descartaOPonto) {
        this.descartaOPonto = descartaOPonto;
   }

   public String getDireitoAdn() {
        return direitoAdn;
   }

   public void setDireitoAdn(String direitoAdn) {
        this.direitoAdn = direitoAdn;
   }

   public BigDecimal getHrCompl() {
        return hrCompl;
   }

   public void setHrCompl(BigDecimal hrCompl) {
        this.hrCompl = hrCompl;
   }

   public String getIndenizaEstab() {
        return indenizaEstab;
   }

   public void setIndenizaEstab(String indenizaEstab) {
        this.indenizaEstab = indenizaEstab;
   }

   public String getOcorrenciaAfdt() {
        return ocorrenciaAfdt;
   }

   public void setOcorrenciaAfdt(String ocorrenciaAfdt) {
        this.ocorrenciaAfdt = ocorrenciaAfdt;
   }

   public String getQFerAfart133() {
        return qFerAfart133;
   }

   public void setQFerAfart133(String qFerAfart133) {
        this.qFerAfart133 = qFerAfart133;
   }

   public BigDecimal getQtdMesesEstab() {
        return qtdMesesEstab;
   }

   public void setQtdMesesEstab(BigDecimal qtdMesesEstab) {
        this.qtdMesesEstab = qtdMesesEstab;
   }

   public String getQuitaFerLicRem() {
        return quitaFerLicRem;
   }

   public void setQuitaFerLicRem(String quitaFerLicRem) {
        this.quitaFerLicRem = quitaFerLicRem;
   }

   public String getReajSalSind() {
        return reajSalSind;
   }

   public void setReajSalSind(String reajSalSind) {
        this.reajSalSind = reajSalSind;
   }

   public String getReduzDiasTrab() {
        return reduzDiasTrab;
   }

   public void setReduzDiasTrab(String reduzDiasTrab) {
        this.reduzDiasTrab = reduzDiasTrab;
   }

   public String getSuspComResiduo() {
        return suspComResiduo;
   }

   public void setSuspComResiduo(String suspComResiduo) {
        this.suspComResiduo = suspComResiduo;
   }

   public String getTipReg() {
        return tipReg;
   }

   public void setTipReg(String tipReg) {
        this.tipReg = tipReg;
   }

   public String getUtilizaMotivo() {
        return utilizaMotivo;
   }

   public void setUtilizaMotivo(String utilizaMotivo) {
        this.utilizaMotivo = utilizaMotivo;
   }

   public String getDeduzDiasAviso() {
        return deduzDiasAviso;
   }

   public void setDeduzDiasAviso(String deduzDiasAviso) {
        this.deduzDiasAviso = deduzDiasAviso;
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
        this.afastamento = vo.asString("AFASTAMENTO");
        this.codAfaCausa = vo.asBigDecimal("CODAFACAUSA");
        this.codAfaRais = vo.asBigDecimal("CODAFARAIS");
        this.codAfast = vo.asString("CODAFAST");
        this.codHistOcor = vo.asBigDecimal("CODHISTOCOR");
        this.descrHistOcor = vo.asString("DESCRHISTOCOR");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.falta = vo.asString("FALTA");
        this.tipTab = vo.asString("TIPTAB");
        this.abateAvisoPrevio = vo.asString("ABATEAVISOPREVIO");
        this.absentismo = vo.asString("ABSENTEISMO");
        this.anexoObrigatorio = vo.asString("ANEXOOBRIGATORIO");
        this.aparecePortal = vo.asString("APARECEPORTAL");
        this.apelido = vo.asString("APELIDO");
        this.baixaProvisao = vo.asString("BAIXAPROVISAO");
        this.codGrupoOco = vo.asBigDecimal("CODGRUPOOCO");
        this.codMotAfast = vo.asString("CODMOTAFAST");
        this.compNProg = vo.asString("COMPNPROG");
        this.cor = vo.asString("COR");
        this.descartaOPonto = vo.asString("DESCARTAOPONTO");
        this.direitoAdn = vo.asString("DIREITOADN");
        this.hrCompl = vo.asBigDecimal("HRCOMPL");
        this.indenizaEstab = vo.asString("INDENIZAESTAB");
        this.ocorrenciaAfdt = vo.asString("OCORRENCIAAFDT");
        this.qFerAfart133 = vo.asString("QFERAFART133");
        this.qtdMesesEstab = vo.asBigDecimal("QTDMESESESTAB");
        this.quitaFerLicRem = vo.asString("QUITAFERLICREM");
        this.reajSalSind = vo.asString("REAJSALSIND");
        this.reduzDiasTrab = vo.asString("REDUZDIASTRAB");
        this.suspComResiduo = vo.asString("SUSPCOMRESIDUO");
        this.tipReg = vo.asString("TIPREG");
        this.utilizaMotivo = vo.asString("UTILIZAMOTIVO");
        this.deduzDiasAviso = vo.asString("DEDUZDIASAVISO");
        return this;
   }
}
