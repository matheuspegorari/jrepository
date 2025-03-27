package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LaudoClassificacao extends AbstractSankhyaEntity<LaudoClassificacao> {
   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getNuRam() {
        return this.getVo().asBigDecimal("NURAM");
   }

   public void setNuRam(BigDecimal nuRam) {
        markAsChanged("NURAM", nuRam);
   }

   public BigDecimal getNuLaudoPai() {
        return this.getVo().asBigDecimal("NULAUDOPAI");
   }

   public void setNuLaudoPai(BigDecimal nuLaudoPai) {
        markAsChanged("NULAUDOPAI", nuLaudoPai);
   }

   public String getAprovado() {
        return this.getVo().asString("APROVADO");
   }

   public void setAprovado(String aprovado) {
        markAsChanged("APROVADO", aprovado);
   }

   public BigDecimal getCodClt() {
        return this.getVo().asBigDecimal("CODCLT");
   }

   public void setCodClt(BigDecimal codClt) {
        markAsChanged("CODCLT", codClt);
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

   public Timestamp getDhAnalise() {
        return this.getVo().asTimestamp("DHANALISE");
   }

   public void setDhAnalise(Timestamp dhAnalise) {
        markAsChanged("DHANALISE", dhAnalise);
   }

   public BigDecimal getNotaRomaneio() {
        return this.getVo().asBigDecimal("NOTAROMANEIO");
   }

   public void setNotaRomaneio(BigDecimal notaRomaneio) {
        markAsChanged("NOTAROMANEIO", notaRomaneio);
   }

   public BigDecimal getNuAmostra() {
        return this.getVo().asBigDecimal("NUAMOSTRA");
   }

   public void setNuAmostra(BigDecimal nuAmostra) {
        markAsChanged("NUAMOSTRA", nuAmostra);
   }

   public BigDecimal getNuCll() {
        return this.getVo().asBigDecimal("NUCLL");
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getTara() {
        return this.getVo().asBigDecimal("TARA");
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodPort() {
        return this.getVo().asBigDecimal("CODPORT");
   }

   public void setCodPort(BigDecimal codPort) {
        markAsChanged("CODPORT", codPort);
   }

   public String getTransgenia() {
        return this.getVo().asString("TRANSGENIA");
   }

   public void setTransgenia(String transgenia) {
        markAsChanged("TRANSGENIA", transgenia);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public String getModulo() {
        return this.getVo().asString("MODULO");
   }

   public void setModulo(String modulo) {
        markAsChanged("MODULO", modulo);
   }

   public BigDecimal getNumPesagem() {
        return this.getVo().asBigDecimal("NUMPESAGEM");
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
   }

   public BigDecimal getCodVeic() {
        return this.getVo().asBigDecimal("CODVEIC");
   }

   public void setCodVeic(BigDecimal codVeic) {
        markAsChanged("CODVEIC", codVeic);
   }

   public BigDecimal getNumNotaTrans() {
        return this.getVo().asBigDecimal("NUMNOTATRANS");
   }

   public void setNumNotaTrans(BigDecimal numNotaTrans) {
        markAsChanged("NUMNOTATRANS", numNotaTrans);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getNumPort() {
        return this.getVo().asBigDecimal("NUMPORT");
   }

   public void setNumPort(BigDecimal numPort) {
        markAsChanged("NUMPORT", numPort);
   }

   public String getMotivoReprov() {
        return this.getVo().asString("MOTIVOREPROV");
   }

   public void setMotivoReprov(String motivoReprov) {
        markAsChanged("MOTIVOREPROV", motivoReprov);
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
        return this;
   }
}
