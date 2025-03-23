package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LaudoClassificacao extends AbstractSankhyaEntity<LaudoClassificacao> {
   private String referencia;
   private Timestamp dhAlter;
   private BigDecimal codUsu;
   private BigDecimal nuRam;
   private BigDecimal nuLaudoPai;
   private String aprovado;
   private BigDecimal codClt;
   private BigDecimal codProd;
   private BigDecimal codProj;
   private Timestamp dhAnalise;
   private BigDecimal notaRomaneio;
   private BigDecimal nuAmostra;
   private BigDecimal nuCll;
   private BigDecimal nuNota;
   private BigDecimal pesoBruto;
   private BigDecimal sequencia;
   private String status;
   private BigDecimal tara;
   private BigDecimal codParc;
   private BigDecimal codPort;
   private String transgenia;
   private BigDecimal numContrato;
   private String modulo;
   private BigDecimal numPesagem;
   private BigDecimal codVeic;
   private BigDecimal numNotaTrans;
   private BigDecimal codEmp;
   private BigDecimal numPort;
   private String motivoReprov;

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getNuRam() {
        return nuRam;
   }

   public void setNuRam(BigDecimal nuRam) {
        markAsChanged("NURAM", nuRam);
        this.nuRam = nuRam;
   }

   public BigDecimal getNuLaudoPai() {
        return nuLaudoPai;
   }

   public void setNuLaudoPai(BigDecimal nuLaudoPai) {
        markAsChanged("NULAUDOPAI", nuLaudoPai);
        this.nuLaudoPai = nuLaudoPai;
   }

   public String getAprovado() {
        return aprovado;
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
        this.aprovado = aprovado;
   }

   public BigDecimal getCodClt() {
        return codClt;
   }

   public void setCodClt(BigDecimal codClt) {
        markAsChanged("CODCLT", codClt);
        this.codClt = codClt;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public Timestamp getDhAnalise() {
        return dhAnalise;
   }

   public void setDhAnalise(Timestamp dhAnalise) {
        markAsChanged("DHANALISE", dhAnalise);
        this.dhAnalise = dhAnalise;
   }

   public BigDecimal getNotaRomaneio() {
        return notaRomaneio;
   }

   public void setNotaRomaneio(BigDecimal notaRomaneio) {
        markAsChanged("NOTAROMANEIO", notaRomaneio);
        this.notaRomaneio = notaRomaneio;
   }

   public BigDecimal getNuAmostra() {
        return nuAmostra;
   }

   public void setNuAmostra(BigDecimal nuAmostra) {
        markAsChanged("NUAMOSTRA", nuAmostra);
        this.nuAmostra = nuAmostra;
   }

   public BigDecimal getNuCll() {
        return nuCll;
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
        this.nuCll = nuCll;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getTara() {
        return tara;
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
        this.tara = tara;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodPort() {
        return codPort;
   }

   public void setCodPort(BigDecimal codPort) {
        markAsChanged("CODPORT", codPort);
        this.codPort = codPort;
   }

   public String getTransgenia() {
        return transgenia;
   }

   public void setTransgenia(String transgenia) {
        markAsChanged("TRANSGENIA", transgenia);
        this.transgenia = transgenia;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public String getModulo() {
        return modulo;
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
        this.modulo = modulo;
   }

   public BigDecimal getNumPesagem() {
        return numPesagem;
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
        this.numPesagem = numPesagem;
   }

   public BigDecimal getCodVeic() {
        return codVeic;
   }

   public void setCodVeic(BigDecimal codVeic) {
        markAsChanged("CODVEIC", codVeic);
        this.codVeic = codVeic;
   }

   public BigDecimal getNumNotaTrans() {
        return numNotaTrans;
   }

   public void setNumNotaTrans(BigDecimal numNotaTrans) {
        markAsChanged("NUMNOTATRANS", numNotaTrans);
        this.numNotaTrans = numNotaTrans;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getNumPort() {
        return numPort;
   }

   public void setNumPort(BigDecimal numPort) {
        markAsChanged("NUMPORT", numPort);
        this.numPort = numPort;
   }

   public String getMotivoReprov() {
        return motivoReprov;
   }

   public void setMotivoReprov(String motivoReprov) {
        markAsChanged("MOTIVOREPROV", motivoReprov);
        this.motivoReprov = motivoReprov;
   }

   @Override
   public String getTableName() {
        return "TGACLL";
   }

   @Override
   public String getEntityName() {
        return "LaudoClassificacao";
   }

   @Override
   public LaudoClassificacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.referencia = vo.asString("REFERENCIA");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuRam = vo.asBigDecimal("NURAM");
        this.nuLaudoPai = vo.asBigDecimal("NULAUDOPAI");
        this.aprovado = vo.asString("APROVADO");
        this.codClt = vo.asBigDecimal("CODCLT");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.dhAnalise = vo.asTimestamp("DHANALISE");
        this.notaRomaneio = vo.asBigDecimal("NOTAROMANEIO");
        this.nuAmostra = vo.asBigDecimal("NUAMOSTRA");
        this.nuCll = vo.asBigDecimal("NUCLL");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.status = vo.asString("STATUS");
        this.tara = vo.asBigDecimal("TARA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codPort = vo.asBigDecimal("CODPORT");
        this.transgenia = vo.asString("TRANSGENIA");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.modulo = vo.asString("MODULO");
        this.numPesagem = vo.asBigDecimal("NUMPESAGEM");
        this.codVeic = vo.asBigDecimal("CODVEIC");
        this.numNotaTrans = vo.asBigDecimal("NUMNOTATRANS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.numPort = vo.asBigDecimal("NUMPORT");
        this.motivoReprov = vo.asString("MOTIVOREPROV");
        return this;
   }
}
