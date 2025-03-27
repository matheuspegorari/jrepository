package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PesagemMultipla extends AbstractSankhyaEntity<PesagemMultipla> {
   public BigDecimal getBalancaPb() {
        return this.getVo().asBigDecimal("BALANCAPB");
   }

   public void setBalancaPb(BigDecimal balancaPb) {
        markAsChanged("BALANCAPB", balancaPb);
   }

   public BigDecimal getBalancaTara() {
        return this.getVo().asBigDecimal("BALANCATARA");
   }

   public void setBalancaTara(BigDecimal balancaTara) {
        markAsChanged("BALANCATARA", balancaTara);
   }

   public BigDecimal getCodPort() {
        return this.getVo().asBigDecimal("CODPORT");
   }

   public void setCodPort(BigDecimal codPort) {
        markAsChanged("CODPORT", codPort);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public BigDecimal getCodUsuPb() {
        return this.getVo().asBigDecimal("CODUSUPB");
   }

   public void setCodUsuPb(BigDecimal codUsuPb) {
        markAsChanged("CODUSUPB", codUsuPb);
   }

   public BigDecimal getCodUsuTara() {
        return this.getVo().asBigDecimal("CODUSUTARA");
   }

   public void setCodUsuTara(BigDecimal codUsuTara) {
        markAsChanged("CODUSUTARA", codUsuTara);
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

   public String getMotorista() {
        return this.getVo().asString("MOTORISTA");
   }

   public void setMotorista(String motorista) {
        markAsChanged("MOTORISTA", motorista);
   }

   public BigDecimal getNumPesagem() {
        return this.getVo().asBigDecimal("NUMPESAGEM");
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getPesagemManual() {
        return this.getVo().asString("PESAGEMMANUAL");
   }

   public void setPesagemManual(String pesagemManual) {
        markAsChanged("PESAGEMMANUAL", pesagemManual);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getPesoCorrigido() {
        return this.getVo().asBigDecimal("PESOCORRIGIDO");
   }

   public void setPesoCorrigido(BigDecimal pesoCorrigido) {
        markAsChanged("PESOCORRIGIDO", pesoCorrigido);
   }

   public BigDecimal getPesoDesconto() {
        return this.getVo().asBigDecimal("PESODESCONTO");
   }

   public void setPesoDesconto(BigDecimal pesoDesconto) {
        markAsChanged("PESODESCONTO", pesoDesconto);
   }

   public BigDecimal getPesoLiq() {
        return this.getVo().asBigDecimal("PESOLIQ");
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
   }

   public String getPlaca() {
        return this.getVo().asString("PLACA");
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
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

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getNmBalPesBruto() {
        return this.getVo().asString("NMBALPESBRUTO");
   }

   public void setNmBalPesBruto(String nmBalPesBruto) {
        markAsChanged("NMBALPESBRUTO", nmBalPesBruto);
   }

   public String getNmBalTara() {
        return this.getVo().asString("NMBALTARA");
   }

   public void setNmBalTara(String nmBalTara) {
        markAsChanged("NMBALTARA", nmBalTara);
   }

   public String getNomeBalanca() {
        return this.getVo().asString("NOMEBALANCA");
   }

   public void setNomeBalanca(String nomeBalanca) {
        markAsChanged("NOMEBALANCA", nomeBalanca);
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

   public BigDecimal getCodMoto() {
        return this.getVo().asBigDecimal("CODMOTO");
   }

   public void setCodMoto(BigDecimal codMoto) {
        markAsChanged("CODMOTO", codMoto);
   }

   public BigDecimal getCodVeic() {
        return this.getVo().asBigDecimal("CODVEIC");
   }

   public void setCodVeic(BigDecimal codVeic) {
        markAsChanged("CODVEIC", codVeic);
   }

   public String getNomeUsuPb() {
        return this.getVo().asString("NOMEUSUPB");
   }

   public void setNomeUsuPb(String nomeUsuPb) {
        markAsChanged("NOMEUSUPB", nomeUsuPb);
   }

   public String getNomeUsuTara() {
        return this.getVo().asString("NOMEUSUTARA");
   }

   public void setNomeUsuTara(String nomeUsuTara) {
        markAsChanged("NOMEUSUTARA", nomeUsuTara);
   }

   public BigDecimal getRetencoes() {
        return this.getVo().asBigDecimal("RETENCOES");
   }

   public void setRetencoes(BigDecimal retencoes) {
        markAsChanged("RETENCOES", retencoes);
   }

   public BigDecimal getCodUsuCancel() {
        return this.getVo().asBigDecimal("CODUSUCANCEL");
   }

   public void setCodUsuCancel(BigDecimal codUsuCancel) {
        markAsChanged("CODUSUCANCEL", codUsuCancel);
   }

   public Timestamp getDhCancel() {
        return this.getVo().asTimestamp("DHCANCEL");
   }

   public void setDhCancel(Timestamp dhCancel) {
        markAsChanged("DHCANCEL", dhCancel);
   }

   public String getNomeUsuCancel() {
        return this.getVo().asString("NOMEUSUCANCEL");
   }

   public void setNomeUsuCancel(String nomeUsuCancel) {
        markAsChanged("NOMEUSUCANCEL", nomeUsuCancel);
   }

   public String getModalidade() {
        return this.getVo().asString("MODALIDADE");
   }

   public void setModalidade(String modalidade) {
        markAsChanged("MODALIDADE", modalidade);
   }

   public String getMotivoCancel() {
        return this.getVo().asString("MOTIVOCANCEL");
   }

   public void setMotivoCancel(String motivoCancel) {
        markAsChanged("MOTIVOCANCEL", motivoCancel);
   }

   @Override
   public String getTableName() {
        return "TGAPES";
   }

   @Override
   public String getEntityName() {
        return "PesagemMultipla";
   }

   @Override
   public PesagemMultipla fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
