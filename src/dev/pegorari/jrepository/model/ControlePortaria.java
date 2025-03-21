package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ControlePortaria extends AbstractSankhyaEntity<ControlePortaria> {
   private BigDecimal codMoto;
   private BigDecimal codPort;
   private BigDecimal codUsu;
   private BigDecimal codVeic;
   private Timestamp dhChega;
   private Timestamp dhEntra;
   private Timestamp dhSaida;
   private String observ;
   private String status;
   private String tipo;
   private BigDecimal codUf;
   private String motorista;
   private String placa;
   private BigDecimal codEmp;
   private BigDecimal numPort;
   private Timestamp dhPesoBruto;
   private Timestamp dhTara;
   private String motivo;
   private BigDecimal nuCll;
   private BigDecimal numPesagem;
   private String modalidade;

   public BigDecimal getCodMoto() {
        return codMoto;
   }

   public void setCodMoto(BigDecimal codMoto) {
        markAsChanged("CODMOTO", codMoto);
        this.codMoto = codMoto;
   }

   public BigDecimal getCodPort() {
        return codPort;
   }

   public void setCodPort(BigDecimal codPort) {
        markAsChanged("CODPORT", codPort);
        this.codPort = codPort;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVeic() {
        return codVeic;
   }

   public void setCodVeic(BigDecimal codVeic) {
        markAsChanged("CODVEIC", codVeic);
        this.codVeic = codVeic;
   }

   public Timestamp getDhChega() {
        return dhChega;
   }

   public void setDhChega(Timestamp dhChega) {
        markAsChanged("DHCHEGA", dhChega);
        this.dhChega = dhChega;
   }

   public Timestamp getDhEntra() {
        return dhEntra;
   }

   public void setDhEntra(Timestamp dhEntra) {
        markAsChanged("DHENTRA", dhEntra);
        this.dhEntra = dhEntra;
   }

   public Timestamp getDhSaida() {
        return dhSaida;
   }

   public void setDhSaida(Timestamp dhSaida) {
        markAsChanged("DHSAIDA", dhSaida);
        this.dhSaida = dhSaida;
   }

   public String getObserv() {
        return observ;
   }

   public void setObserv(String observ) {
        markAsChanged("OBSERV", observ);
        this.observ = observ;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
        this.codUf = codUf;
   }

   public String getMotorista() {
        return motorista;
   }

   public void setMotorista(String motorista) {
        markAsChanged("MOTORISTA", motorista);
        this.motorista = motorista;
   }

   public String getPlaca() {
        return placa;
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
        this.placa = placa;
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

   public Timestamp getDhPesoBruto() {
        return dhPesoBruto;
   }

   public void setDhPesoBruto(Timestamp dhPesoBruto) {
        markAsChanged("DHPESOBRUTO", dhPesoBruto);
        this.dhPesoBruto = dhPesoBruto;
   }

   public Timestamp getDhTara() {
        return dhTara;
   }

   public void setDhTara(Timestamp dhTara) {
        markAsChanged("DHTARA", dhTara);
        this.dhTara = dhTara;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
        this.motivo = motivo;
   }

   public BigDecimal getNuCll() {
        return nuCll;
   }

   public void setNuCll(BigDecimal nuCll) {
        markAsChanged("NUCLL", nuCll);
        this.nuCll = nuCll;
   }

   public BigDecimal getNumPesagem() {
        return numPesagem;
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
        this.numPesagem = numPesagem;
   }

   public String getModalidade() {
        return modalidade;
   }

   public void setModalidade(String modalidade) {
        markAsChanged("MODALIDADE", modalidade);
        this.modalidade = modalidade;
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
        this.setOriginalVO(vo);
        this.codMoto = vo.asBigDecimal("CODMOTO");
        this.codPort = vo.asBigDecimal("CODPORT");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVeic = vo.asBigDecimal("CODVEIC");
        this.dhChega = vo.asTimestamp("DHCHEGA");
        this.dhEntra = vo.asTimestamp("DHENTRA");
        this.dhSaida = vo.asTimestamp("DHSAIDA");
        this.observ = vo.asString("OBSERV");
        this.status = vo.asString("STATUS");
        this.tipo = vo.asString("TIPO");
        this.codUf = vo.asBigDecimal("CODUF");
        this.motorista = vo.asString("MOTORISTA");
        this.placa = vo.asString("PLACA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.numPort = vo.asBigDecimal("NUMPORT");
        this.dhPesoBruto = vo.asTimestamp("DHPESOBRUTO");
        this.dhTara = vo.asTimestamp("DHTARA");
        this.motivo = vo.asString("MOTIVO");
        this.nuCll = vo.asBigDecimal("NUCLL");
        this.numPesagem = vo.asBigDecimal("NUMPESAGEM");
        this.modalidade = vo.asString("MODALIDADE");
        return this;
   }
}
