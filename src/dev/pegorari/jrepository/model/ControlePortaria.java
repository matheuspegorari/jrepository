package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControlePortaria extends AbstractSankhyaEntity<ControlePortaria> {
   public BigDecimal getCodMoto() {
        return this.getVo().asBigDecimal("CODMOTO");
   }

   public void setCodMoto(BigDecimal codMoto) {
        markAsChanged("CODMOTO", codMoto);
   }

   public BigDecimal getCodPort() {
        return this.getVo().asBigDecimal("CODPORT");
   }

   public void setCodPort(BigDecimal codPort) {
        markAsChanged("CODPORT", codPort);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVeic() {
        return this.getVo().asBigDecimal("CODVEIC");
   }

   public void setCodVeic(BigDecimal codVeic) {
        markAsChanged("CODVEIC", codVeic);
   }

   public Timestamp getDhChega() {
        return this.getVo().asTimestamp("DHCHEGA");
   }

   public void setDhChega(Timestamp dhChega) {
        markAsChanged("DHCHEGA", dhChega);
   }

   public Timestamp getDhEntra() {
        return this.getVo().asTimestamp("DHENTRA");
   }

   public void setDhEntra(Timestamp dhEntra) {
        markAsChanged("DHENTRA", dhEntra);
   }

   public Timestamp getDhSaida() {
        return this.getVo().asTimestamp("DHSAIDA");
   }

   public void setDhSaida(Timestamp dhSaida) {
        markAsChanged("DHSAIDA", dhSaida);
   }

   public String getObserv() {
        return this.getVo().asString("OBSERV");
   }

   public void setObserv(String observ) {
        markAsChanged("OBSERV", observ);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public String getMotorista() {
        return this.getVo().asString("MOTORISTA");
   }

   public void setMotorista(String motorista) {
        markAsChanged("MOTORISTA", motorista);
   }

   public String getPlaca() {
        return this.getVo().asString("PLACA");
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
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

   public Timestamp getDhPesoBruto() {
        return this.getVo().asTimestamp("DHPESOBRUTO");
   }

   public void setDhPesoBruto(Timestamp dhPesoBruto) {
        markAsChanged("DHPESOBRUTO", dhPesoBruto);
   }

   public Timestamp getDhTara() {
        return this.getVo().asTimestamp("DHTARA");
   }

   public void setDhTara(Timestamp dhTara) {
        markAsChanged("DHTARA", dhTara);
   }

   public String getMotivo() {
        return this.getVo().asString("MOTIVO");
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
   }

   public BigDecimal getNuCll() {
        return this.getVo().asBigDecimal("NUCLL");
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
   }

   public BigDecimal getNumPesagem() {
        return this.getVo().asBigDecimal("NUMPESAGEM");
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
   }

   public String getModalidade() {
        return this.getVo().asString("MODALIDADE");
   }

   public void setModalidade(String modalidade) {
        markAsChanged("MODALIDADE", modalidade);
   }

   @Override
   public String getTableName() {
        return "TGARPO";
   }

   @Override
   public String getEntityName() {
        return "ControlePortaria";
   }

   @Override
   public ControlePortaria fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
